import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        ArrayList<Integer> msis = new ArrayList<>();
        for (Integer it : rack) {
            msis.add(it);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(rack.get(i)>rack.get(j) && msis.get(i)<msis.get(j)+rack.get(i))
                    msis.set(i,msis.get(j)+rack.get(i));
            }
        }
        int max=0;
        for (Integer integer : msis) {
            max=Math.max(max,integer);
        }

        return max;
    }
}