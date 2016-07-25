/**
 * Created by Leart Doko on 10/23/2015.
 */
public class AddDigits {
    public int addDigits(int num) {
        int numModulo = num;
        int temp;
        do{
            temp = 0;
            for(int i = 0; i < 10; i++){
                temp += numModulo % 10;
                numModulo /= 10;
            }
            numModulo = temp;
        }while(temp >= 10);
        return temp;
    }
}
