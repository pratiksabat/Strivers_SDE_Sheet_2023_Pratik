import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ss(arr,0,target,n,res,new ArrayList<>());
        return res;
    }
     static void ss(ArrayList<Integer> arr, int idx, int k, int n,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> sub ){
        //base cond
        if(k==0){
           res.add(new ArrayList<>(sub));
           return;
        }

        for (int index = idx; index <n; index++) {
            if(index>idx && arr.get(index)==arr.get(index-1)) continue;
            if(arr.get(index)>k) break;

            sub.add(arr.get(index));
            ss(arr, index+1, k-arr.get(index), n, res, sub);
            sub.remove(sub.size()-1);
        }

    }
}