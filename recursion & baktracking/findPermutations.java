import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> res = new ArrayList<>();
        per(s,"",res);
        return res;
    }

    public static void per(String s,String curr,List<String> res){
        if(s.length()==0){
            res.add(curr);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            // System.out.println("Hello1");
            per(s.substring(0,i)+s.substring(i+1),curr+s.charAt(i), res);
            //  System.out.println("Hello2");
            // per(s, i+1, curr, res);
        }
        // per(s, idx+1, curr+s.charAt(idx), res);
        // // curr=curr.substring(0,curr.length()-1);
        // per(s, idx+1, curr, res);
    }
}