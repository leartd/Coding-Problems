import java.util.Random;

/**
 * Created by Leart Doko on 7/13/2016.
 */
//Should extend GuessGame
public class Problem374 {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(true){
            int middle = start + (end-start)/2;
            int guess = guess(middle);
            if(guess == 0){
                return middle;
            } else if (guess < 0) {
                end = middle;
            } else {
                start = middle+1;
            }
        }
    }

    private int guess(int val){
        Random random = new Random();
        return random.nextInt(3);
    }

    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
}
