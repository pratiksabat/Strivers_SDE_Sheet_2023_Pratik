import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int[] denom = {1000,500,100,50,20,10,5,2,1};
        int noOfCoins=0;
        for(int d:denom){
            if(amount>=d){
                if(amount%d==0){
                    noOfCoins+=amount/d;
                    return noOfCoins;
                }else{
                    int temp=amount/d;
                    amount=amount%d;
                    noOfCoins+=temp;
                }
            }
        }
        return noOfCoins;
    }
}
