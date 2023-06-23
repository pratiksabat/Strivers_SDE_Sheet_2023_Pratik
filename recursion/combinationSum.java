import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ss(arr,0,k,n,res,new ArrayList<>());
        return res;
    }

     static void ss(ArrayList<Integer> arr, int idx, int k, int n,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> sub ){
        
        //base cond
        if(idx==n){
            if(k==0){
                res.add(new ArrayList<>(sub));
            }
            return;
        }
        
            sub.add(arr.get(idx));
            ss(arr, idx+1, k-arr.get(idx), n, res, sub);
            sub.remove(sub.size()-1);
            ss(arr, idx+1, k, n, res, sub);
    }
}