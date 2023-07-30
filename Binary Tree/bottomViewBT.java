import java.util.* ;

import java.io.*; 
/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

*********************************************/


public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        ArrayList <Integer> res = new ArrayList<Integer>();
        TreeMap<Integer,Integer> hp = new TreeMap();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            hp.put(curr.hd, curr.node.val);

            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1, curr.node.left));
            }

            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1, curr.node.right));
            }
        }

        for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {
            res.add(entry.getValue());
        } 
        return res;
    }
}

class Pair{
    int hd;
    BinaryTreeNode node;

    Pair(int hd,BinaryTreeNode node){
        this.hd=hd;
        this.node=node;
    }
}
