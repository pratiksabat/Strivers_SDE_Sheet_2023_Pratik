import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
          int l=j+1,r=n-1;
          while (l<r) {
            int sum=arr[i]+arr[j]+arr[l]+arr[r];
            if(sum==target){
              l++;
              r--;
              return "Yes";
            }else if(sum>target) r--;
            else l++;
          }
        }
      }
      return "No";
  }
}
