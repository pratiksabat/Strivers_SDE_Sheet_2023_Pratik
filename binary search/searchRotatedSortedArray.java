import java.util.Arrays;

public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        if(arr.length==1){
            return arr[0]==key?0:-1;
        }
        int l=0,r=arr.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if(arr[m]==key) return m;
            
            if(arr[l]<=arr[m]){
                if(key>=arr[l] && key<=arr[m]) r=m-1;
                else l=m+1;
            }
            else{
                if(key>=arr[m] && key<=arr[r]) l=m+1;
                else r=m-1;
            }
        }
        return -1;
    }
}