/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem70 {
    public int climbStairs(int n) {
        int[] memo = new int[n];
        if (n <= 1)
            return 1;
        else if (n == 2)
            return 2;
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 2; i < memo.length; i++)
            memo[i] = memo[i - 1] + memo[i - 2];
        return memo[n - 1];
    }
}
