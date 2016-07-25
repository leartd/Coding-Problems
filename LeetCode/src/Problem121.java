import java.util.TreeMap;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
        int maxProfit = 0;
        tree.put(prices[0], 0);
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - tree.firstKey() > maxProfit) {
                maxProfit = prices[i] - tree.firstKey();
            }
            tree.put(prices[i], i);
        }
        return maxProfit;
    }
}
