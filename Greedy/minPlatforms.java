import java.util.Arrays;

public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);

        int max=1,platform=1;
        int i=1,j=0;

        while (i<n && j<n) {
            if(at[i]<=dt[j]){
                platform++;
                i++;
            }else if(at[i]>dt[j]){
                platform--;
                j++;
            }

            max=Math.max(max,platform);
        }
        return max;
    }
}