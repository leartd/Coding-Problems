/**
 * Created by Leart Doko on 7/12/2016.
 */
public class Problem7 {
    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }

        double val = 0;
        while (x != 0) {
            val = val * 10 + x % 10;
            x = x / 10;
        }
        if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            return 0;
        }

        if (negative) {
            return (int) (-1 * val);
        } else {
            return (int) val;
        }
    }
}
