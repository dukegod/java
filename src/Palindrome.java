/**
 * Created by hui on 2017/11/10.
 */
public class Palindrome {
    private int max = 0;
    private String res = "";

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            checkPalindromeExpand(s, i, i);
            checkPalindromeExpand(s, i, i+1);
        }
        return res;
    }

    public void checkPalindromeExpand(String s, int low, int high) {
        while (low >= 0 && high < s.length()) {
            if (s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > max) {
                    max = high - low + 1;
                    res = s.substring(low, high + 1);
                }
                low--;
                high++;
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Palindrome o = new Palindrome();
        String site = o.longestPalindrome("abbbbb");
        System.out.println("hw" + site);
    }
}
