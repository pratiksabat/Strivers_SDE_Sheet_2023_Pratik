import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here. 
        Arrays.sort(positions);
        int low=1,high=positions[n-1]-positions[0];   
        int res=0;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(isFeasible(positions,n,c,mid)){
                res=mid;
                low=mid+1;
            }else high=mid-1;
        }
        return res;
    }

    public static boolean isFeasible(int[] positions, int n,  int c, int dist){
        int coord=positions[0],count=1;

        for (int i = 1; i < positions.length; i++) {
            if(positions[i]-coord>=dist){
                coord=positions[i];
                count++;
            }

            if(count==c) return true;
        }

        return false;
    }

}