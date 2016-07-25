/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem14 {
    public static void main(String[] args) {
        int start = 1000000;
        double longestChain = 0;
        double longestChainNumber = 0;

        for (int i = start; i > 0; i--) {
            double temp = i;
            double chain = 0;
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                    chain++;
                } else {
                    temp = 3 * temp + 1;
                    chain++;
                }
            }

            if (chain > longestChain) {
                longestChain = chain;
                longestChainNumber = i;
            }
        }
        System.out.println(longestChainNumber);
    }
}
