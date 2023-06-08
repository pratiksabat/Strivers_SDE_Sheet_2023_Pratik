import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.      
        // int res=(int) Math.pow(x, n);
        // res=res%m;
        // return res;  
        // long pow=(long)n,ans=1;
        // long x1=(long)x;
        // long m1=(long) m;
        // while(pow>0){
        //     if(pow%2==1){
        //         //odd
        //         ans=((ans%m1)*(x1%m1)%m1);
        //         pow=pow-1;
        //     }else{
        //         ans=((x1%m1)*(x1%m1)%m1);
        //         pow=pow/2;
        //     }
        // }
        // int res=(int)(ans);
        // return res;
        long ans = 1;
        long xx = x;
        while(n>0){
            if(n%2 !=0){
                ans = ((ans)%m *(xx)% m ) %m;
            }
            xx = ((xx)%m *(xx)%m)%m;
            n= n>>1;
        }  
        return(int) (ans%m);
    }
}
