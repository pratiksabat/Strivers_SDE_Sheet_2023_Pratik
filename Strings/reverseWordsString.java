public class Solution 
{
public static String reverseString(String str) {
    String[] arr = str.split(" ");
    StringBuilder sb = new StringBuilder();

    for (int i = arr.length - 1; i >= 0; i--) {
        sb.append(arr[i].trim()).append(" ");
    }

    return sb.toString().trim();
}

}
