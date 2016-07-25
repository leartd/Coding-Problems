/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem28 {
    public static void main(String [] args) {
        int layers = 500;
        int startValue = 3;
        startValue = 1 + calculateLayers(startValue, 1, layers);
        System.out.println(startValue);
    }

    private static int calculateLayers(int startValue, int n, int layers) {
        if (n > layers)
            return 0;
        int [] arr = new int[4];
        arr[0] = startValue;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 2 * n;
        }
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum + calculateLayers(arr[3] + 2 * (n + 1), n + 1, layers);
    }
}
