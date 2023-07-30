import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        // 10^n + prev*10^n-1
        // n=1;
        // 10+1*1=11
        // n=2;
        // 10+11*1=21
        // n=3
        // 10+21*1000=2110
        if(n==1) return "1";
        if(n==2) return "11";

        String res="11";
        for (int i = 3; i <=n; i++) {
            String nextStr="";
            res+="&";
            int c=1;
            for (int j = 1; j < res.length(); j++) {
                if(res.charAt(j-1)!=res.charAt(j)){
                    int v = Character.getNumericValue(res.charAt(j-1));
                    nextStr+=(c+""+v);
                    c=1;
                }else c++;
            }
            res=nextStr;
        }
        return res;
    }
}