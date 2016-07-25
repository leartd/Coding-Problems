import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return pascal;
        }
        int currentRow = 1;
        while (currentRow <= numRows) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < currentRow; i++) {
                if (i == 0 || i == currentRow - 1) {
                    temp.add(1);
                } else {
                    temp.add((pascal.get(currentRow - 2)).get(i - 1) + (pascal.get(currentRow - 2)).get(i));
                }
            }
            pascal.add(temp);
            currentRow++;
        }
        return pascal;
    }
}
