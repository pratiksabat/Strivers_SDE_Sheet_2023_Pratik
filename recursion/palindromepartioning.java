import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> res = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        sss(s,0,res,sub);
        return res;
    }

    static void sss(String str, int idx,List<List<String>> res,List<String> sub){
        //base cond
        if(idx==str.length()){
           res.add(new ArrayList<>(sub));
           return;
        }

        for (int i = idx; i < str.length(); i++) {
            if(isPalindrome(str,idx,i)){
                sub.add(str.substring(idx,i+1));
                sss(str,i+1,res,sub);
                sub.remove(sub.size()-1);
            }
        }
    }

    static boolean isPalindrome(String str, int l, int r){
        while (l<r) {
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}