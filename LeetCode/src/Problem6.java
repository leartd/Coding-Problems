/**
 * Created by Leart Doko on 10/26/2015.
 */
public class Problem6 {
    public String convert(String s, int numRows) {
        StringBuilder[] test = new StringBuilder[numRows];
        for (int i = 0; i < test.length; i++) {
            test[i] = new StringBuilder();
        }
        boolean zig = false;
        int zag = 0;
        for (int i = 0; i < s.length(); i++) {
            test[zag].append(s.charAt(i));
            if(zig == false){
                zag++;
                if(zag == test.length){
                    if(test.length == 2){
                        zag-=2;
                        zig = false;
                    }else{
                        if(test.length == 1){
                            zag--;
                            zig = false;
                        }else{
                            zag-=2;
                            zig = true;
                        }
                    }

                }
            }else{
                zag--;
                if(zag<1){
                    zig = false;
                    zag = 0;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < test.length; i++) {
            result.append(test[i].toString());
        }
        return result.toString();
    }
}
