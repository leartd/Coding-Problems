/**
 * Created by Leart Doko on 7/7/2016.
 */
public class Problem345 {
    public String reverseVowels(String s) {
        if (s.length() < 2)
            return s;
        StringBuilder word = new StringBuilder(s);
        int i = 0;
        int j = word.length() - 1;

        while (i <= j && j > -1 && i < word.length()) {
            char start = word.charAt(i);
            char end = word.charAt(j);
            boolean startVowel = isVowel(start);
            boolean endVowel = isVowel(end);
            if (startVowel == true && endVowel == true) {
                word.replace(i, i + 1, end + "");
                word.replace(j, j + 1, start + "");
                i++;
                j--;
            }
            if (endVowel == false) {
                j--;
            }
            if (startVowel == false) {
                i++;
            }
        }

        return word.toString();
    }

    /**
     * Taken from: http://stackoverflow.com/a/19161184
     */
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
