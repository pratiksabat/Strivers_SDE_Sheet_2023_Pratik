import java.util.* ;
import java.io.*; 

class Node{
    Node[] child = new Node[26];

    boolean contains(Character ch){
        return child[ch-'a']!=null;
    }
}
public class Solution {
    
       
    public static int distinctSubstring(String word) {
        // Write your code here.
        // if(word.length()==1) return 1;

        // HashSet<String> res = new HashSet<>();
        // String str="";
        // for (int i = 0; i < word.length(); i++) {
        //     str=word.charAt(i)+"";
        //     res.add(str);
        //     for (int j = i+1; j < word.length(); j++) {
        //         str+=word.charAt(j)+"";
        //         res.add(str);
        //     }
        // }

        // return res.size();
         Node root = new Node();
        int c=0;
        for(int i=0;i<word.length();i++){
            Node curr = root;
            for (int j = i; j < word.length(); j++) {
                Character ch = word.charAt(j);
                if(!curr.contains(ch)){
                curr.child[ch-'a']=new Node();
                c++;
                }
                curr= curr.child[ch-'a'];
            }
        }
        return c;        
    }
}
