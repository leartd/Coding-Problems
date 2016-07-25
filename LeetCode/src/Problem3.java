import java.util.*;

/**
 * Created by Leart Doko on 10/25/2015.
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, count = 0;
        LinkedList<Character> substring = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || !substring.contains(s.charAt(i))) {
                substring.add(s.charAt(i));
            } else {
                while (!substring.peek().equals(s.charAt(i))) {
                    substring.remove();
                    count--;
                }
                if (substring.peek().equals(s.charAt(i))) {
                    substring.remove();
                    count--;
                }
                substring.add(s.charAt(i));
            }
            count++;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
