import java.util.* ;
import java.io.*; 

class Node{
  Node[] childNodes = new Node[26];
  boolean isEndOfWord;

  boolean contains(Character c){
    return childNodes[c-'a']!=null;
  }
}
class Trie{
  Node root;

      public Trie() {
        // Write your code here.
        root= new Node();
    }

  public void insert(String word) {
        // Write your code here.
        Node curr = root;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)){
                curr.childNodes[ch-'a']=new Node();
            }
            curr= curr.childNodes[ch-'a'];
        }
        curr.isEndOfWord=true;
  }

  public boolean containsStr(String word){
    Node curr = root;
    boolean flag=true;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)) return false;
            curr=curr.childNodes[ch-'a'];
            flag=flag && curr.isEndOfWord;
        }
        return flag;
  }
}
class Solution {

  public static String completeString(int n, String[] a) {
    // Write your code here.
    Trie t = new Trie();
    for (String string : a) {
      t.insert(string);
    }
    String longest="";
        for(String str:a){
            if(t.containsStr(str)){
                if(str.length()>longest.length()){
                    longest = str;
                }else if(str.length() == longest.length() && str.compareTo(longest)<0){
                    longest = str;
                }
            }
        }

        if(longest.length()==0)return "None";
        return longest;

  }
}