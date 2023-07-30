import java.util.*;
import java.io.*;

public class Solution {
    public static boolean findPattern(String p, String s) {
        // Write your code here.
        // Write your code here.
        int m = p.length(), n = s.length();
        for (int i = 0; i <= n - m; i++) {
            if (s.substring(i, m).equals(p))
                return true;
        }
        return false;
    }
}