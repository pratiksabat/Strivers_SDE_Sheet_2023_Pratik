public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.
        int p1=0,p2=0;
        int temp=0;
        while(p1<m && p2<n && k>0){
           if(row1[p1]<=row2[p2]){
               temp=row1[p1];
               p1++;
           }else{
               temp=row2[p2];
               p2++;
           }     
           k--;
        }
        if(k>0){
            while(p1<m&&k>0){
                temp=row1[p1];
                p1++;
                k--;
            }
            while(p2<n&&k>0){
                temp=row2[p2];
                p2++;
                k--;
            }
        }
        return temp;
    }
}
