import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
		LinkedListNode<Integer> temp=head;

		while (temp!=null) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(temp.data);
			newNode.next=temp.next;
			temp.next=newNode;
			temp=temp.next.next;
		}

		LinkedListNode<Integer> temp1=head;

		while (temp1!=null) {
			if(temp1.random!=null)
				temp1.next.random=temp1.random.next;
			temp1=temp1.next.next;
		}

		LinkedListNode<Integer> temp2=head;
		LinkedListNode<Integer> dummy = new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> pointer=dummy;
	LinkedListNode<Integer> fast;
	while (temp2!=null) {
		fast=temp2.next.next;
		pointer.next=temp2.next;
		temp2.next=fast;
		pointer=pointer.next;
		temp2=fast;
	}
	return dummy.next;
	}
}
