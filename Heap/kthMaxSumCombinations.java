import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.AbstractMap.SimpleEntry;

public class Solution {
    public static ArrayList<Integer> kMaxSumCombination(List<Integer> a, List<Integer> b, int n, int k) {
        PriorityQueue<SimpleEntry<Integer, SimpleEntry<Integer, Integer>>> maxHeap = new PriorityQueue<>(
                (x, y) -> Integer.compare(y.getKey(), x.getKey()));

        // O(NlogN)
        a.sort((x, y) -> Integer.compare(y, x));
        b.sort((x, y) -> Integer.compare(y, x));

        ArrayList<Integer> res = new ArrayList<>();

        // m is a 2D matrix to mark {i, j} as already visited
        int[][] m = new int[n][n];
        maxHeap.offer(new SimpleEntry<>(a.get(0) + b.get(0), new SimpleEntry<>(0, 0)));
        m[0][0] = 1;

        // O(klogN)
        while (k > 0) {
            SimpleEntry<Integer, SimpleEntry<Integer, Integer>> top = maxHeap.poll();
            int topVal = top.getKey();
            int i = top.getValue().getKey();
            int j = top.getValue().getValue();
            res.add(topVal);
            k--;

            // After popping the largest element in the maxHeap,
            // get the component indices i and j and push the sum
            // of elements a[i+1]+b[j] and a[i]+b[j+1] only if those
            // pair of indices are not visited
            if (j + 1 < n && m[i][j + 1] == 0) {
                maxHeap.offer(new SimpleEntry<>(a.get(i) + b.get(j + 1), new SimpleEntry<>(i, j + 1)));
                m[i][j + 1] = 1;
            }
            if (i + 1 < n && m[i + 1][j] == 0) {
                maxHeap.offer(new SimpleEntry<>(a.get(i + 1) + b.get(j), new SimpleEntry<>(i + 1, j)));
                m[i + 1][j] = 1;
            }
        }

        return res;
    }
}
