import java.util.HashSet;

/**
 * Created by Leart Doko on 7/7/2016.
 */
public class Problem202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        boolean cycle = false;
        do{
            set.add(n);
            int number = n;
            int nextNum = 0;
            while (number > 0) {
                nextNum += Math.pow(number % 10,2);
                number = number / 10;
            }

            if(nextNum == 1){
                return true;
            }
            else{
                n = nextNum;
                if(set.contains(nextNum)){
                    cycle=true;
                }
            }
        }while(cycle==false);

        return !cycle;
    }
}
