import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Leart Doko on 7/21/2016.
 */
public class MinimumDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
            ArrayList<Integer> list = map.get(A[A_i]);//Integer.parseInt(A[A_i]));
            if (list == null) {
                list = new ArrayList<Integer>();
            }
            list.add(A_i);
            map.put(A[A_i], list);
        }

        int smallestDistance = 1000000;
        for (Integer key : map.keySet()) {
            ArrayList<Integer> entry = map.get(key);
            if (entry.size() == 2) {
                if (entry.get(1) - entry.get(0) < smallestDistance) {
                    smallestDistance = entry.get(1) - entry.get(0);
                }
            } else if (entry.size() > 2) {
                int smallestSoFar = 1000000;
                for (int i = 0; i < entry.size() - 1; i++) {
                    if (entry.get(i + 1) - entry.get(i) < smallestSoFar) {
                        smallestSoFar = entry.get(i + 1) - entry.get(i);
                    }
                }
                if (smallestSoFar < smallestDistance) {
                    smallestDistance = smallestSoFar;
                }
            }
        }

        if (smallestDistance == 1000000) {
            System.out.println(-1);
        } else {
            System.out.println(smallestDistance);
        }
    }
}
