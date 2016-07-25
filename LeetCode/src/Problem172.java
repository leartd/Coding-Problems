/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem172 {
    public int trailingZeroes(int n) {
        int exponent = 1;
        int result = 0;
        double temp = Math.pow(5, exponent);
        while(temp <= n){
            result += n/temp;
            exponent++;
            temp = Math.pow(5, exponent);
        }
        return result;
    }
}
