/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem165 {
    public static int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) {
            return 0;

        }
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int max = v1.length > v2.length ? v2.length : v1.length;

        for (int i = 0; i < max; i++) {
            int v1Val = Integer.parseInt(v1[i]);
            int v2Val = Integer.parseInt(v2[i]);
            if (v1Val > v2Val) {
                return 1;
            } else if (v1Val < v2Val) {
                return -1;
            }
        }

        if (v1.length > v2.length && Integer.parseInt(v1[v1.length - 1]) != 0) {
            return 1;
        } else if (v1.length < v2.length && Integer.parseInt(v2[v2.length - 1]) != 0) {
            return -1;
        }

        return 0;
    }
}
