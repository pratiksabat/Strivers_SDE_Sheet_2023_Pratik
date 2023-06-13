/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node dummy=new Node();
        dummy.next=head;

        Node fast=dummy;
        Node slow=dummy;

        for (int i = 1; i <=K; i++) {
            fast=fast.next;
        }

        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }

        // remove the link
        slow.next=slow.next.next;

        return dummy.next;

    }
}