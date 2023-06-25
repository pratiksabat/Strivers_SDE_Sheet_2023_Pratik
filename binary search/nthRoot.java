public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.

        int low=1,high=m;

        while (low<=high) {
            int mid = low+(high-low)/2;

            if(mul(mid,n)==m) return mid;
            else if(mul(mid,n)>m) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

    public static int mul(int num,int n){
        return (int)Math.pow(num, n);
    }
}
