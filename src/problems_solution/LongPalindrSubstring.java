package problems_solution;

public class LongPalindrSubstring {
    /*
    Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

    Example 1:
    Input: "babad"
    Output: "bab"
    Note: "aba" is also a valid answer.

    Example 2:
    Input: "cbbd"
    Output: "bb"
     */

    public String longestPalindrome(String s) {
        String string_result = "";
        for (int i=0; i<s.length();i++) {
            int j = i;
            int k = s.length()-1;
            System.out.println("String length : "+s.length()+", i : "+i+", charAt : "+s.charAt(i)+".");
            while (j<k) {
                int end_point = 0;
                if (s.charAt(j)==s.charAt(k) && j+1==k) {
                    System.out.println("CharAt j :"+j+", k:"+k+".");
                    System.out.println("CharAt j string :"+s.charAt(j)+", k:"+s.charAt(k)+", end_point : "+end_point+".");
                    string_result = s.substring(i,end_point);
                    System.out.println("Longest Palindrome String ("+i+") : "+string_result);
                    break;
                } else if (s.charAt(j)==s.charAt(k)) {
                    j++; k--;
                } else {
                    end_point = k;
                    k--;
                }
            }
        }
        return "";
    }
}
