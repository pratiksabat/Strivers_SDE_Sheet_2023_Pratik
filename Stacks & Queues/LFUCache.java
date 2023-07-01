import java.util.* ;
import java.io.*;

public class LFUCache {

    int capacity;
    int currSize;
    int minFrequency;
    HashMap<Integer,Node> cache = new HashMap<>();
    HashMap<Integer,DoublyLL> frequencyList = new HashMap<>();
    LFUCache(int capacity) {
        // Write your code here.
        this.capacity=capacity;
        this.currSize=0;
        this.minFrequency=0;
    }

    int get(int key) {
        Node node = cache.get(key);
        if(node==null) return -1;
        insertToHead(node);
        return node.val;
    }

    void put(int key, int value) {
        if(capacity==0) return;

        // Write your code here.
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            //update value
            node.val=value;
            //update the map
            insertToHead(node);

        }else{
            currSize++;

            if(currSize>capacity){
                DoublyLL minFreqList = frequencyList.get(minFrequency);
                //remove from cache too
                cache.remove(minFreqList.tail.prev.key);
                // removing last recently used from List
                minFreqList.remove(minFreqList.tail.prev);
                currSize--;
            }

            minFrequency=1;
            Node node = new Node(key, value);
            DoublyLL minFreqList = frequencyList.getOrDefault(minFrequency, new DoublyLL());
            minFreqList.insertAtHead(node);
            frequencyList.put(minFrequency, minFreqList);
            cache.put(key, node);
        }
    }

    void insertToHead(Node node){
        DoublyLL currList = frequencyList.get(node.freq);
        currList.remove(node);

        if(node.freq==minFrequency && currList.currSize==0)
            minFrequency++;

        node.freq++;
        DoublyLL newList = frequencyList.getOrDefault(node.freq, new DoublyLL());
        newList.insertAtHead(node);
        frequencyList.put(node.freq, newList);
    }
}

class Node{
    Node prev,next;
    int key,val,freq;

    Node(int k,int v){
        key=k;
        val=v;
        freq=1;
    }
}

class DoublyLL{
    Node head,tail;
    int currSize;

    DoublyLL() {
        // Write your code here.
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next=tail;
        tail.prev=head;
        this.currSize=0;
    }

    public void insertAtHead(Node node){
        Node nextNode = head.next;
        node.next = nextNode;
        node.prev = head;
        head.next = node;
        nextNode.prev = node;

        currSize++;
    }

    public void remove(Node node){

        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;

        currSize--;
    }
}