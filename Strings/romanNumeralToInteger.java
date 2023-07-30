import java.util.* ;
import java.io.*; 
public class Solution {
    public static int romanToInt(String s) {
        // Write your code here
        HashMap<Character,Integer> hp = new HashMap<>();
        hp.put('I',1);
        hp.put('V',5);
        hp.put('X',10);
        hp.put('L',50);
        hp.put('C',100);
        hp.put('D',500);
        hp.put('M',1000);

        int res = hp.get(s.charAt(s.length()-1));

        for (int i = s.length()-2; i >=0; i--) {
            if(hp.get(s.charAt(i))<hp.get(s.charAt(i+1)))
                res-=hp.get(s.charAt(i));
            else res+=hp.get(s.charAt(i));
        }
        return res;
    }
}