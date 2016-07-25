import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Leart Doko on 7/21/2016.
 */
public class CounterGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        BigInteger[] numbers = new BigInteger[testCases];
        for (int i = 0; i < testCases; i++) {
            numbers[i] = new BigInteger(in.next());
        }

        BigInteger one = new BigInteger("" + 1);
        BigInteger two = new BigInteger("" + 2);

        for (int i = 0; i < numbers.length; i++) {
            int turn = 0;
            while (numbers[i].equals(one) == false) {
                if (numbers[i].bitCount() == 1) {
                    numbers[i] = numbers[i].divide(two);
                } else {
                    byte[] representation = numbers[i].toByteArray();
                    for (int j = 0; j < representation.length; j++) {
                        if (j == 0) {
                            if (representation[j] < 2) {
                                representation[j] = 0;
                            } else if (representation[j] < 4) {
                                representation[j] = 2;
                            } else if (representation[j] < 8) {
                                representation[j] = 4;
                            } else {
                                representation[j] = 8;
                            }

                        } else {
                            representation[j] = 0;
                        }
                    }
                    BigInteger powOfTwo = new BigInteger(representation);
                    numbers[i] = numbers[i].subtract(powOfTwo);
                }
                turn++;
            }

            if (turn - 1 % 2 == 0) {
                System.out.println("Louise");
            } else {
                System.out.println("Richard");
            }

        }
    }
}
