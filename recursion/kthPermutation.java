import java.util.*;

public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        int fact=1;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact*=i;
            nums.add(i);
        }
        // adding the last num;
        nums.add(n);
        //use 0 based indexing so k-1
        k=k-1;
        String res = "";
        while (true) {
            res+=nums.get(k/fact);
            nums.remove(k/fact);

            if(nums.size()==0){
                break;
            }
            k%=fact;
            fact/=nums.size();
        }

        return res;
    }
}
