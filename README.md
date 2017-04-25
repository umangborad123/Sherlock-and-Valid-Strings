# Sherlock and Valid Strings
Check whether string is valid or not - Hackerrank question

> You know my powers, my dear Watson, and yet at the end of three months I was forced to confess that I had at last met an antagonist who was my intellectual equal.

A "Valid" string is a string S such that for all distinct characters in S each character occurs the same number of times in S.

For example, "aabb" is a valid string because the frequency of both characters a and b is 2,
whereas "aabbc" is not valid string because the frequency of characters a, b, and c is not the same.

Watson gives a string S to Sherlock and asks him to remove some characters from the string such that
the new string is a "valid" string.

Sherlock wants to know from you if it's possible to be done with less than or equal to one removal.

**Input format:**
The first and only line contains S, the string Watson gives to Sherlock.

**Constraints:**
- 1 <= |S| <= 10<sup>5</sup>
- String S contains lowercase letters only (a-z).


**Output format:**
Output YES if string S can be converted to a "valid" string by removing less than or equal
to one one character.
Else, output NO.

**Sample Input:**
aabbcd

**Sample Output:**
NO

2 is the minimum number of removals required to make it a valid string. It can be done in following two ways:

Remove c and d to get aabb. 
Or remove a and b to get abcd.
