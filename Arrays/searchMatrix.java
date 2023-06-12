import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int row=mat.size();
        for (int i = 0; i < row; i++) {
            if(target==mat.get(i).get(0)) return true;
            else if(target>mat.get(i).get(0)&&target<=mat.get(i).get(mat.get(i).size()-1)){
                int col=mat.get(i).size();
                for (int j = 0; j < col; j++) {
                    if(mat.get(i).get(j)==target) return true;
                }
            }
        }
        return false;
    }
}
