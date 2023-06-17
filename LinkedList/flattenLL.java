/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head==null || head.next==null) return head;

        head.next=flattenLinkedList(head.next);
        head=mergeTwoLL(head,head.next);

        return head;

    }

    public static Node mergeTwoLL(Node a, Node b){
        Node dummy=new Node(0);
        Node temp=dummy;
        a.next=null; // Extra thing for this prob
        b.next=null;// Extra thing for this prob
        while (a!=null && b!=null) {
            if(a.data<b.data){
                dummy.child=a;
                dummy=dummy.child;
                a=a.child;
            }else{
                dummy.child=b;
                dummy=dummy.child;
                b=b.child;
            }
        }

        if(a!=null) dummy.child=a;
        else dummy.child=b;

        return temp.child;
    }
}