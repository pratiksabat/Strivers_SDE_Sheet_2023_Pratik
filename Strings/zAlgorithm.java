public class Solution {

	public static int zAlgorithm(String s, String p, int n, int m) {
		// Write your code here
		// int c=0;
		// for (int i = 0; i+m <=n; i++) {
		// 	// System.out.println(s.substring(i,i+m));
		// 	if(s.substring(i,i+m).equals(p)) c++;
		// }
		// return c;

			// Write your code here
        String str = p+s;
        int[] z = new int[str.length()];
        int l = 0;
        int r = 0;
        for(int i=1;i<str.length();i++){
            if(i>r){
                // set the window
                l=i;
                r=i;
                while(r<str.length() && str.charAt(r-l)==str.charAt(r)) r++;
                z[i] = r-l;
                r--;
            }else{
                // i is in window
                if(i+z[i-l]<r) z[i] = z[i-l];
                else{
                    l=i; // if window don't have information then reset window
                    while(r<str.length() && str.charAt(r-l)==str.charAt(r)) r++;
                    z[i] = r-l;
                    r--;
                }
            }
        }
        
            int count = 0;
            for(int ele : z) if(ele>=p.length()) count++;
            
            return count;

	}

}