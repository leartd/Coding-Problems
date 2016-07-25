/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem231 {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        if (n == 0) {
            return false;
        }
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
                if (count >= 2) {
                    return false;
                }
            }
            n = n >> 1;
        }
        if (count == 0) {
            return false;
        }
        return true;
    }
}
