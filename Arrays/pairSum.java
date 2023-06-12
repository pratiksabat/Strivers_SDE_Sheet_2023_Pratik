import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        // Arrays.sort(arr);
        List<int[]> ans = new ArrayList<>();
        HashMap<Integer,Integer> hs =new HashMap<>();

        for(int i:arr){
            int rem=s-i;
            if(hs.containsKey(rem)){
                int c=hs.get(rem);
                while(c-->0) ans.add(new int[]{Math.min(i,rem),Math.max(i,rem)});                
            }
            hs.put(i,hs.getOrDefault(i, 0)+1);
        }
        Collections.sort(ans, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0], b[0]);
            }
        });
        return ans;
    }
}
