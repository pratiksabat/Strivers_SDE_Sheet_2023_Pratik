import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        long low=0,high=0;
        for (int i : time) {
            low=Math.max(low, i);
            high+=i;
        }
        // System.out.println(low+"==="+high);
        long res=0;
        while (low<=high) {
            long mid =(long)(low +(high-low)/2);

            if(isFeasible(n,time,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return res;
    }

    public static boolean isFeasible(int n, int[] time,long mid){
        long noOfDays=1,sum=0;
        for (int i = 0; i < time.length; i++) {
            if(sum+time[i]>mid){
                sum=time[i];
                noOfDays++;
            }else{
                sum+=time[i];
            }
        }

        return noOfDays<=n;
    }
}