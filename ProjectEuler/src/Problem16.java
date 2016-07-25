import java.math.BigInteger;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem16 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2").pow(1000);
        String s2[] = num.toString().split("");
        int a = 0;
        for (String s : s2) {
            a += Integer.parseInt(s);
        }
        System.out.println("Answer " + a);
    }
}
