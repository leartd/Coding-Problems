/**
 * Created by Leart Doko on 7/13/2016.
 */
public class Problem58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        int count = 0;
        if (lastSpace == s.length() - 1) {
            for (int i = lastSpace - 1; i >= 0 && ' ' != s.charAt(i); i--) {
                count++;
            }
        } else {
            count = s.length() - s.lastIndexOf(" ") - 1;
        }

        return count;
    }
}
