import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        int l=0,r=n-1;
        long res=0L;
        long maxLeft=0L;
        long maxRight=0L;

        while(l<=r){
            
            if(arr[l]<=arr[r]){
                if(arr[l]>maxLeft) maxLeft=arr[l];
                else res+=maxLeft-arr[l];

                l++;
            }else{
                if(arr[r]>maxRight) maxRight=arr[r];
                else res+=maxRight-arr[r];

                r--;
            }

        }
        return res;
    }
}
