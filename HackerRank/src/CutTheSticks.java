import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Leart Doko on 7/22/2016.
 */
public class CutTheSticks {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }

        int count;
        do {
            count = 0;
            int newSmallest = Integer.MAX_VALUE;

            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) <= 0) {
                    continue;
                }
                count++;
                int newValue = nums.get(i) - smallest;
                if (newValue < newSmallest && newValue > 0) {
                    newSmallest = newValue;
                }
                nums.set(i, newValue);
            }
            smallest = newSmallest;
            if (count != 0) {
                System.out.println(count);
            }
        }
        while (count != 0);
    }
}
