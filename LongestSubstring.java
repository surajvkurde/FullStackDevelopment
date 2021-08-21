/* Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet=new HashSet<Character>();
        
        int max=0; //max length
        int i=0; //left index of sliding window
        
        for(int j=0;j<s.length();j++)
        {
            char c=s.charAt(j);
            while(charSet.contains(c))
            {
                charSet.remove(c);
                i++;
            }
            charSet.add(c);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
