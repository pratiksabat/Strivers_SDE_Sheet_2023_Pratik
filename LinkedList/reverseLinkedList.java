import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head==null || head.next==null) return head;

		LinkedListNode<Integer> dummy=null;
		/*
		null->1->2->->3->4
		f.    s
		*/

		while(head!=null){
			LinkedListNode<Integer> node=head.next;
			head.next=dummy;
			dummy=head;
			head=node;
		}
		return dummy;
    }
}