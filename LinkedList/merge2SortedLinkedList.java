import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> dummy=new LinkedListNode<>(null);
        LinkedListNode<Integer> res=dummy;
            // System.out.println("Hi");

        while (first!=null && second!=null) {
            // System.out.println(first.data+"==="+second.data);
            if(first.data<second.data){
               res.next=first;
               res=res.next;
               first=first.next; 
            }else{
               res.next=second;
               res=res.next;
               second=second.next;  
            }
        }
        while (first!=null) {
            res.next=first;
               res=res.next;
               first=first.next; 
        }
        while (second!=null) {
            res.next=second;
               res=res.next;
               second=second.next;   
        }

        return dummy.next;
	}
}
