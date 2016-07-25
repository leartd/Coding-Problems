import java.util.ArrayList;

/**
 * Created by Leart Doko on 10/22/2015.
 */
public class Problem10 {
    public static void main(String[] args) {
        SieveOfPrimes nums = new SieveOfPrimes(2000000);
        int[] primes = nums.getPrimes();
        long sum = 0;
        for (int i = 0; i < primes.length; i++)
            sum += primes[i];
        System.out.println(sum);
    }

    static class SieveOfPrimes {
        boolean[] arr;

        public SieveOfPrimes(int size) {
            arr = new boolean[size];
            arr = sieve(arr);
        }

        private boolean[] sieve(boolean[] numbers) { //boolean array instantiated as false
            for (int i = 2; i < numbers.length; i++) {
                if (!numbers[i]) {
                    for (int j = i + i; j < numbers.length; j += i) {
                        numbers[j] = true;
                    }
                }
            }
            return numbers;
        }

        public int[] getPrimes() {
            ArrayList<Integer> primes = new ArrayList<Integer>();
            for (int i = 2; i < arr.length; i++) {
                if (!arr[i]) {
                    primes.add(i);
                }
            }

            int[] ret = new int[primes.size()];
            for (int i = 0; i < primes.size(); i++) {
                ret[i] = primes.get(i);
            }
            return ret;
        }
    }
}
