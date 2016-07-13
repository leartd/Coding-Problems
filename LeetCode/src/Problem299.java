/**
 * Created by Leart Doko on 7/8/2016.
 */
public class Problem299 {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] cowsSecret = new int[10];
        int[] cowsGuess = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            } else {
                cowsSecret[secret.charAt(i) - '0']++;
                cowsGuess[guess.charAt(i) - '0']++;
            }
        }

        String ret = bull + "A";
        for (int i = 0; i < cowsSecret.length; i++) {
            if (cowsSecret[i] >= cowsGuess[i] && cowsSecret[i] != 0 && cowsGuess[i] != 0) {
                cow += cowsGuess[i];
            }

            if (cowsSecret[i] < cowsGuess[i] && cowsSecret[i] != 0 && cowsGuess[i] != 0) {
                cow += cowsSecret[i];
            }
        }

        return ret + cow + "B";
    }
}
