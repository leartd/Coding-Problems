import java.math.BigInteger;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem25 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");
        BigInteger temp;
        boolean found = false;
        int i = 2;
        while (!found) {
            temp = num1.add(num2);
            i++;
            num1 = num2;
            num2 = temp;
            if (temp.toString().length() >= 1000) {
                found = true;
            }
        }
        System.out.println(i);
    }
}
