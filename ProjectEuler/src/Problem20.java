import java.math.BigInteger;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem20 {
    public static void main(String[] args) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 100; i > 0; i--) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        int sum = 0;
        String[] s = factorial.toString().split("");
        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}
