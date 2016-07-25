/**
 * Created by Leart Doko on 10/26/2015.
 */
public class Problem50 {
    public static double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        if (n < 1) {
            x = 1.0 / x;
            n = -n;
        }
        if (n == 1) {
            return x;
        }
        double result = myPow(x, n / 2);
        result *= result;
        if (n % 2 != 0) {
            result *= x;
        }
        return result;
    }
}
