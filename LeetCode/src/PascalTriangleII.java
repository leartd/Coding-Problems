import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leart Doko on 11/9/2015.
 */
public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex + 1; i++) {
            if (i == 0 || i == rowIndex) {
                row.add(1);
            } else {
                double numer = 1, denom = 1;
                for (int j = rowIndex; j > rowIndex-i; j--) {
                    numer *= (j*1.0);
                }
                System.out.println(numer);
                for (int j = 0; j < i; j++) {
                    denom *= ((j+1)*1.0);
                }
                System.out.println(denom);
                System.out.println("Result is: " + numer/denom);
                row.add((int)Math.round(numer / denom));
            }
        }
        return row;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
            System.out.println(getRow(23).toString());
//        }
    }
}
