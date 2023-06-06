import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long c=0L;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n && i<j;j++){
                if(arr[i]>arr[j]) c++;
            }
        }
        return c;
    }
}
