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
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head==null || head.next==null) return head;

        Node temp=head;
        Node prev=null;
        // Node temp1=head;
        // Node prev1=null;
        Node dummy=new Node(0);
        
        int len=0;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
            len++;
        }
        // System.out.println(temp.data);
        prev.next=head;
        dummy=prev;
        int rem=len-(k%len);
        // System.out.println(rem);
        while(rem>0){
          prev=prev.next;  
            rem--;
        }

        head=prev.next;
        prev.next=null;
        return head;

    }
}
