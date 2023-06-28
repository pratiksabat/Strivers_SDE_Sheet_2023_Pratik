import java.util.* ;
import java.io.*; 

class Node{

    Node[] childNodes = new Node[26];
    int countEndsWith;
    int countStartsWith;

    boolean contains(Character ch){
        return childNodes[ch-'a']!=null;
    }
}
public class Trie {

    private static Node root;
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
            curr.countStartsWith++;
        }
        curr.countEndsWith++;
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node curr = root;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)) return 0;
            curr= curr.childNodes[ch-'a'];
        }
        return curr.countEndsWith;
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        Node curr = root;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)) return 0;
            curr= curr.childNodes[ch-'a'];
        }
        return curr.countStartsWith;
    }

    public void erase(String word) {
        // Write your code here.
        Node curr = root;
        for (Character ch : word.toCharArray()) {
            if(!curr.contains(ch)) return;
            curr= curr.childNodes[ch-'a'];
            curr.countStartsWith--;
        }
        curr.countEndsWith--;
    }

}
