
class Node{
    Node[] children = new Node[26];
    boolean isEndOfWord;

    Node(){

    }

    boolean contains(Character c){
        return children[c-'a']!=null;
    }
}

public class Trie {

    private static Node root;

    //Initialize your data structure here

    Trie() {
        //Write your code here
        root = new Node();
    }


    //Inserts a word into the trie

    public static void insert(String word) {
        //Write your code here
        Node curr = root;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)){
                curr.children[ch-'a']=new Node();
            }
            curr=curr.children[ch-'a'];
        }
        curr.isEndOfWord=true;
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        //Write your code here
        Node curr = root;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)) return false;
            curr=curr.children[ch-'a'];
        }
        return curr.isEndOfWord;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        //Write your code here
        Node curr = root;
        for (Character ch : prefix.toCharArray()) {
            if(!curr.contains(ch)) return false;
            curr=curr.children[ch-'a'];
        }
        return true;
    }
}