/**
 * Created by Leart Doko on 6/7/2016.
 */
public class Problem344 {
    public String reverseString(String s) {
        StringBuilder strBld = new StringBuilder();
        strBld.append(s);
        return strBld.reverse().toString();
    }
}