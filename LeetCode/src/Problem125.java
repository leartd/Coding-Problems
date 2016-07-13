/**
 * Created by Leart Doko on 7/12/2016.
 */
public class Problem125 {
    public boolean isPalindrome(String s) {
        String palindrome = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
