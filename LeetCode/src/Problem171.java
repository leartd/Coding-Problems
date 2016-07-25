/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem171 {
    public int titleToNumber(String s) {
        char base = 'A';
        int result = 0;
        int multiplier = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = s.charAt(i) - base + 1;
            value *= Math.pow(26, multiplier);
            result += value;
            multiplier++;
        }

        return result;
    }
}
