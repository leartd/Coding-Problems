/**
 * Created by Leart Doko on 7/12/2016.
 */
public class Problem278 {
    public int firstBadVersion(int n) {
        int max = n;
        int min = 1;
        boolean notFound = true;
        int middle = 0;
        while(notFound){
            middle = min+(max-min)/2;
            if(min >= max){
                notFound=false;
                break;
            }
            if(isBadVersion(middle)){
                max = middle;
            }else{
                min = middle+1;
            }
        }
        return middle;
    }

    public boolean isBadVersion(int n){
        return Math.random() < 0.5;
    }
}
