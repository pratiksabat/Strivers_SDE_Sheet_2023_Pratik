import java.util.*;
import java.io.*;

public class Solution {
    public static int compareVersions(String a, String b) {
        String[] arr1 = a.split("\\.");
        String[] arr2 = b.split("\\.");

        int maxLength = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < maxLength; i++) {
        double v1 = i<arr1.length?Double.valueOf(arr1[i]):0;
        double v2 = i<arr2.length?Double.valueOf(arr2[i]):0;

        if (v1 > v2) return 1;
        else if (v2 > v1) return -1;
        }

        return 0;
       
    }
}
