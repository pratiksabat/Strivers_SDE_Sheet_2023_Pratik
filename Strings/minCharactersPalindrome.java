
public class Solution {

    public static int minCharsforPalindrome(String str) {
        //Write your code here
        int i=0,j=str.length()-1,end=j,c=0;

        while (i<j) {
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                c++;
                i=0;
                j=--end;
            }
        }

        return c;
    }

}