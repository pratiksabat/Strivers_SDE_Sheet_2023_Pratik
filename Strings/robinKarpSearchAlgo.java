import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< Integer > stringMatch(String text, String pattern){
        // Write your code here.
        List< Integer > res = new ArrayList<>();
        int len=text.length();
        int idx=0;
        while (idx<len) {
            if(idx+pattern.length()-1<len && text.substring(idx,idx+pattern.length()).equals(pattern)){
                res.add(idx+1);
                // idx++;
                // idx+=pattern.length();
            }
            // else  idx++;
            idx++;
        }

        return res;
    }
}