import java.util.ArrayList;
import java.util.*;

class Node {
    Node[] bits = new Node[2];

    Node() {

    }

    boolean contains(int bit) {
        return bits[bit] != null;
    }
}

class Trie {
    Node root;

    Trie() {
        root = new Node();
    }

    public void insert(int num) {
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!curr.contains(bit)) {
                curr.bits[bit] = new Node();
            }
            curr = curr.bits[bit];
        }
    }

    public int getMaxXOR(int num) {
        Node curr = root;
        int max = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.contains(1 - bit)) {
                max = max | (1 << i);
                curr = curr.bits[1 - bit];
            } else {
                curr = curr.bits[bit];
            }
        }
        return max;
    }
}

public class Solution {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        // Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> offlineQueries = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            ArrayList<Integer> sub = new ArrayList<>();
            sub.add(queries.get(i).get(1));
            sub.add(queries.get(i).get(0));
            sub.add(i);
            offlineQueries.add(sub);
        }

        Collections.sort(offlineQueries, (a, b) -> (a.get(0) - b.get(0)));

        Trie t = new Trie();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < offlineQueries.size(); i++) {
            res.add(-1);
        }
        int idx = 0;
        for (int i = 0; i < offlineQueries.size(); i++) {
            while (idx < arr.size() && arr.get(idx) <= offlineQueries.get(i).get(0)) {
                t.insert(arr.get(idx));
                idx++;
            }
            int queryIdx = offlineQueries.get(i).get(2);
            if (idx != 0) {
                res.set(queryIdx, t.getMaxXOR(offlineQueries.get(i).get(1)));
            } else {
                res.set(queryIdx, -1);
            }
        }
        return res;
    }
}