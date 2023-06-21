import java.util.*;
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
         List<int[]> activities = new ArrayList<int[]>(start.size());
        for (int i = 0; i < start.size(); i++) {
            activities.add(new int[] { start.get(i), end.get(i) });
        }
        // activities.sort(new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] a1, int[] a2) {
        //         return a1[1] - a2[1];
        //     }
        // });
        Collections.sort(activities,new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[1]-b[1];
            }
        });
        int count = 0;
        int endTime = 0;
        for (int[] activity : activities) {
            if (activity[0] >= endTime) {
                count++;
                endTime = activity[1];
            }
        }
        return count;
    }
}