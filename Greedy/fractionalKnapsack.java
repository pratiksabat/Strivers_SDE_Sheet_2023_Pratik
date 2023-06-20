import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/

public class Solution {
   public static double maximumValue(Pair[] items, int n, int w) {
           // Write your code here.
        // ITEMS contains {weight, value} pairs.
    //    Arrays.sort(items,new Comparator<Pair>(){
    //        public int compare(Pair i1, Pair i2) {
    //            return i2.value*i1.weight - i2.weight * i1.value;
    //        }
    //    });
    //    double ans = 0;
    //    for(int i =0;i<n;i++) {
    //        if(w>=items[i].weight) {
    //            ans += items[i].value;
    //            w -= items[i].weight;
    //        } else {
    //            ans += (double)items[i].value*w/(double)items[i].weight;
    //            break;
    //        }
    //    }
    //    return ans;

	Arrays.sort(items, new Comparator<Pair>() {
		public int compare(Pair p1,Pair p2){
			double d1=(double)p1.value/(double)p1.weight;
			double d2=(double)p2.value/(double)p2.weight;
			if(d1<d2) return 1;
			else if(d1>d2) return -1;
			else return 0;
		}
	});
	double ans=0;
	double total_weight=0;
	for (int i = 0; i < n; i++) {
		if(total_weight+items[i].weight<=w){
			total_weight+=items[i].weight;
			ans+=items[i].value;
		}else{
			double rem = w-total_weight;
			double res=((double)items[i].value/(double)items[i].weight)*(double)rem;
			ans+=res;
			break;
		}
	}
	return ans;

   }
}