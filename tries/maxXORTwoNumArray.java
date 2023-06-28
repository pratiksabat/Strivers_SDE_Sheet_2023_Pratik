import java.util.* ;
import java.io.*; 

/**
 * Node
 */
class Node {
Node[] bits = new Node[2];

boolean contains(int bit){
    return bits[bit]!=null;
}
    
}

/**
 * trie
 */
class Trie {

private Node root;

Trie(){
    root= new Node();
}

public void insert(int num){
    Node curr = root;

    for (int i = 31; i>=0; i--) {
        int bit = (num >> i) & 1;
        if(!curr.contains(bit)){
            curr.bits[bit]=new Node();
        }
        curr = curr.bits[bit];
    }
}

public int getMaxXor(int num){
    Node curr = root;
    int max=0;
    for (int i = 31; i>=0; i--) {
        int bit = (num >> i) & 1;
        if(!curr.contains(1-bit)){
            curr = curr.bits[bit];
        }else{
            max=max | (1 << i);
            curr = curr.bits[1-bit];
        }
    }
    return max;
}
    
}
public class Solution {

    public static int maximumXor(int[] A) {
        // int max=0;
        // // Write your Code here
        // for (int i = 0; i < A.length; i++) {
        //     for (int j = i+1; j < A.length; j++) {
        //         max=Math.max(max,A[i]^A[j]);
        //     }
        // }
        // return max;

        Trie t = new Trie();
        for (int i : A) t.insert(i);
        int max=0;
        for (int i : A) {
            max=Math.max(max,t.getMaxXor(i));
        }
        return max;
    }
}