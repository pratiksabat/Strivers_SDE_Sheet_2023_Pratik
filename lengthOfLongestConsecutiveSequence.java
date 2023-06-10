import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        // Set<Integer> hs = new HashSet<>();
        // for(int i:arr)
        //     hs.add(i);
        // int max=0;
        // for(int i:hs){
        //     if(!hs.contains(i-1)){
        //         int curr=i;
        //         int streak=1;
        //         while (hs.contains(curr+1)) {
        //             streak++;
        //             curr++;
        //         }
        //         max=Math.max(max,streak);
        //     }
        // }
        // return max;
                Arrays.sort(arr);
        int c=0,prev=Integer.MIN_VALUE,max=0;
        for(int i=0;i<N;i++){
            if(i==0){
                
                c=1;
            }else{
                // System.out.println(arr[i]+"===="+arr[i-1]);
                if(arr[i]==arr[i-1]+1) c++;
                else if(arr[i]==arr[i-1]){
                    continue;
                }
                else{ 
                    max=Math.max(max,c);
                    c=1;
                }
// System.out.println("Count="+c+". MAX is="+max);
            }
        }
        return Math.max(max,c);
    }
}
