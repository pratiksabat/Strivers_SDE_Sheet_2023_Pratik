import java.util.* ;
import java.io.*;

public class Solution {
    public static int findCelebrity(int n) {
        // Write your code here.

        int l=0,r=n-1;

        while (l<r) {
            if(Runner.knows(l,r)) l++;
            else r--;
        }

        // validate all row elements of that idx is 0
        for (int i = 0; i < n; i++) {
            if(Runner.knows(l,i)==false && l!=i)
                continue;
            else if(l!=i)return -1;
        }
        // validate all col elements of that idx is 1
        for (int i = 0; i < n; i++) {
            if(Runner.knows(i,l)==true && l!=i)
                continue;
            else if(l!=i) return -1;
        }

        return l;
    }
}
