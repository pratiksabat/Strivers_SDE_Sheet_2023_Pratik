import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        // ArrayList<Integer> arr = new ArrayList<>();
        //  // Add the elements of array1 to the arrayList
        // for (int num : a) {
        //     arr.add(num);
        // }

        // // Add the elements of array2 to the arr
        // for (int num : b) {
        //     arr.add(num);
        // }
        // Collections.sort(arr);
        // int n=arr.size();
        // return n%2==0?(double)(arr.get(n/2)+arr.get(n/2-1))/2:arr.get(n/2);

        // int len=a.length+b.length;
        // if(len%2==0){
        //     int p1=0,p2=0,l=0;
        //     int m=len/2;
        //     while (p1<a.length && p2<b.length) {
        //         if(m==1){
        //             // System.out.println(a[p1]+":"+b[p2]);
        //             return (double)(a[p1]+b[p2])/2;
        //         }
        //         if(a[p1]<=b[p2]){
        //             p1++;
        //         }else{
        //             p2++;
        //         }
        //         m--;
        //     }
        // }else{
        //     int p1=0,p2=0;
        //     int m=len/2;
        //     while (p1<a.length && p2<b.length) {
        //         if(m==0){
        //             // System.out.println(a[p1]+":"+b[p2]);
        //             return Math.min(a[p1],b[p2]);
        //         }
        //         if(a[p1]<=b[p2]){
        //             p1++;
        //         }else{
        //             p2++;
        //         }
        //         m--;
        //     }
        // }
        // return -1;
        int n1=a.length, n2=b.length;
        int low=0,high=n1-1;
        while(low<=high){
            int cut1=low+(high-low)/2;
            int cut2 = (n1+n2)/2-cut1;

            int l1=cut1==0?Integer.MIN_VALUE:a[cut1-1];
            int l2=cut2==0?Integer.MIN_VALUE:b[cut2-1];
            int r1=cut1==0?Integer.MAX_VALUE:a[cut1];
            int r2=cut2==0?Integer.MAX_VALUE:b[cut2];

            if(l1>r2) high=cut1-1;
            else if(l2>r1) low=cut1+1;
            else{
                return (n1+n2)%2==0?(Math.max(l1,l2)+Math.min(r1, r2))/2.0:Math.min(r1, r2);
            }
        }
        return 0.0;
    }
}