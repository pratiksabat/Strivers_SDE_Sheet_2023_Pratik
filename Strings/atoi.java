import java.util.* ;
import java.io.*; 
public class Solution {
       public static int atoi(String str) {
        // Write your code here.
        String res="";
        for (Character ch : str.toCharArray()) {
            if(ch-'a'<0)
                res+=(ch+"");
        }
        if(res.equals("")) return 0;
        return Integer.parseInt(res);
    }
}
