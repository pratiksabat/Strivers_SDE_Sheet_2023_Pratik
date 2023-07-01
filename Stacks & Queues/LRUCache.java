import java.util.HashMap;

public class LRUCache
{
    Node head,tail;
    HashMap<Integer,Node> hp;
    int capacity;
    LRUCache(int capacity)
    {
        head = new Node(0,0);
        tail = new Node(0,0);
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
        hp = new HashMap<>();
    }

    public int get(int key)
    {
        // Write your code here
        if (hp.containsKey(key)){
            // get ele
            Node node = hp.get(key);
            // remove node
            remove(node);
            //insert towards head
            insertToHead(node);
            //
            return node.val;
        }else{
            return -1;
        }

    }

    public void put(int key, int value)
    {
        // Write your code here
        if (hp.containsKey(key)){
            remove(hp.get(key));
        }
        if(hp.size()==capacity){
            remove(tail.prev);
        }
        insertToHead(new Node(key,value));
    }

    public void remove(Node node){
        //remove from HM
        hp.remove(node.key);
        /**
         1 -> 2 -> 3
         <-   <-
         **/
        // Node prev = temp.prev;
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insertToHead(Node node){
        hp.put(node.key, node);
        /**
         head -> 1 -> 2 -> 3
         <-   <-
         4
         |
         v
         head -> 1 -> 2 -> 3
         <-   <-

         **/
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
        // Node prev = temp.prev;
        // prev.next=temp.next;
        // temp.next.prev=prev;
    }


}

class Node{
    Node prev,next;
    int key,val;

    Node(int k, int v){
        // prev = new Node(null);
        // next = new Node(null);
        key=k;
        val=v;
    }
}

