import java.util.HashSet;



/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        // Better Solution
        // HashSet<Node> hs = new HashSet<>();

        // Node temp=firstHead;
        // while (temp!=null) {
        //     hs.add(temp);
        //     temp=temp.next;
        // }

        // Node temp2=secondHead;
        // while (temp2!=null) {
        //     if(hs.contains(temp2)){
        //         return temp2.data;
        //     }
        //     temp2=temp2.next;
        // }

        // return 0;

        // Optimised
        if(firstHead==null || secondHead==null) return 0;

        Node first=firstHead;
        Node second=secondHead;

        while (first!=second) {
                first=first==null?secondHead:first.next;
                second=second==null?firstHead:second.next;
        }

        return first.data;
    }
}