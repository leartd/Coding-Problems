import java.util.HashMap;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem290 {
    public boolean wordPattern(String pattern, String str) {
        pattern = pattern.trim();
        str = str.trim();
        if (pattern.equals("") || str.equals("")) {
            return false;
        }

        String[] strArr = str.split(" ");
        String[] patArr = pattern.split("");

        if (patArr.length != strArr.length) return false;

        HashMap<String, String> patternMap = new HashMap<String, String>();

        for (int i = 0; i < strArr.length; i++) {
            if (patternMap.get(patArr[i]) == null && !patternMap.containsValue(strArr[i])) {
                patternMap.put(patArr[i], strArr[i]);
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            if (patternMap.get(patArr[i]) == null || !patternMap.get(patArr[i]).equals(strArr[i])) {
                return false;
            }
        }

        return true;
    }
}
