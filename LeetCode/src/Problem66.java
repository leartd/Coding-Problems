/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem66 {
    public int[] plusOne(int[] digits) {
        boolean increaseArray = false;
        if (digits.length > 0) {
            digits[digits.length - 1] += 1;
        }
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] > 9) {
                digits[i] -= 10;
                if (i - 1 >= 0) {
                    digits[i - 1] += 1;
                } else {
                    increaseArray = true;
                }
            }
        }
        if (increaseArray == true) {
            int[] answer = new int[digits.length + 1];
            System.arraycopy(digits, 0, answer, 1, digits.length);
            answer[0] = 1;
            return answer;
        } else {
            return digits;
        }
    }
}
