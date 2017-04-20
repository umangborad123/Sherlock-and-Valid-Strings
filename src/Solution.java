import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.next();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == null)
                hm.put(s.charAt(i), 1);
            else
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
        }
        Set<Character> set = hm.keySet();
        Iterator it = set.iterator();
        int comp;
        boolean isFirst = false, ans = false;
        int max = hm.get(it.next()), t = max;
        while (it.hasNext()) {
            t = hm.get(it.next());
            if (t>max)
                max = t;
        }
        Iterator it2 = set.iterator();
        int count =0, otherCount=0;
        int prev = 0;
        while (it2.hasNext()) {
            comp = hm.get(it2.next());
            if (comp == prev)
                otherCount++;
            if (comp != max)
                count++;
            else if (comp == max)
                otherCount++;
            prev = comp;
        }

        if (count <= 1 || otherCount == hm.size()-1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}