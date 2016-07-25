/**
 * Created by Leart Doko on 10/22/2015.
 */
public class Problem9 {
    public static void main(String[] args) {
        for (int a = 0; a < 1000 - 2; a++) {
            for (int b = a + 1; b < 1000 - 1; b++) {
                for (int c = b + 1; c < 1000; c++) {
                    if (isPythagoreanTriplet(a, b, c) && (a + b + c == 1000))
                        System.out.println(a * b * c);
                }
            }
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return ((a * a + b * b) == c * c);
    }
}
