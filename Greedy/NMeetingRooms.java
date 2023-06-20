import java.util.* ;
import java.util.stream.Collectors;
import java.io.*; 
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
                int len=start.length;
                List<List<Integer>> arr = new ArrayList<>();
        // Map<Integer,Integer> hp = new HashMap<>();
        for (int i = 0; i < len; i++) {
            List<Integer> sub = new ArrayList<>();
            sub.add(start[i]);
            sub.add(end[i]);
            sub.add(i+1);
            arr.add(sub);
        }
Collections.sort(arr, new Comparator<List<Integer>>() {
    @Override
    public int compare(List<Integer> a, List<Integer> b) {
        return a.get(1).compareTo(b.get(1));
    }
});


        // for (int i=0;i<len;i++) {
        //     end[i]=al.get(i);
        //     start[i]=hp.get(al.get(i));
        // }

       
        List<Integer> res = new ArrayList<>();
        res.add(arr.get(0).get(2));
         int le=arr.get(0).get(1);
        for (int i = 1; i < len; i++) {
            if(arr.get(i).get(0)>le){
                res.add(arr.get(i).get(2));
                // ls=start[i];
                le=arr.get(i).get(1);
            }
        }
        return res;
    }
}