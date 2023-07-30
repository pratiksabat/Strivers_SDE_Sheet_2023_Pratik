import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        if(str1.length()!=str2.length()) return false;
        HashSet<Character> hs = new HashSet<>();
        for (Character ch : str1.toCharArray()) {
            hs.add(ch);
        }
        for (Character ch : str2.toCharArray()) {
            if(hs.contains(ch)==false) return false;
        }
        return true;

    }
}