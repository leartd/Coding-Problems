/**
 * Created by Leart Doko on 11/9/2015.
 */
public class Problem9 {
    public static boolean isPalindrome(int x) {
        int length = String.valueOf(x).length();
        if(x < 0){
            return false;
        }
        for (int i = 0; i < length; i++) {
            int beginning = 1, end = 1;
            beginning = (int) (x / Math.pow(10, i)) % 10;
            end = (int) (x / Math.pow(10, length - i - 1)) % 10;
            if (beginning != end)
                return false;
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isPalindrome(101));
    }
}
