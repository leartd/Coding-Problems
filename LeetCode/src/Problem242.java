import java.util.Arrays;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);

            char[] tArray = t.toCharArray();
            Arrays.sort(tArray);

            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i] != tArray[i]) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
