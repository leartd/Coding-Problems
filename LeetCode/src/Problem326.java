/**
 * Created by Leart Doko on 7/6/2016.
 */
public class Problem326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        if ((Math.log10(n) / Math.log10(3)) % 1 == 0)
            return true;
        else
            return false;
    }
}
