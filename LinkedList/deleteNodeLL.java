import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        // System.out.println(node.data);
        node.data=node.next.data;
        node.next=node.next.next;
        // node=node.next;
	}
}