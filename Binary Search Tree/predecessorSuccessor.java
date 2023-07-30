import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// Write your code here.
				ArrayList<Integer> ans = new ArrayList<>();
		ans.add(floorInBST(root, key));
		ans.add(findCeil(root, key));

		return ans;		
	}

	private static int floorInBST(BinaryTreeNode<Integer> root, int x) {
        //    Write your code here.
        int floor = -1;

        while(root!= null){
            if(root.data >= x){
                root = root.left;
            }else{
                floor = root.data;
                root = root.right;
            }
            
        }

        return floor;
    }

	private static int findCeil(BinaryTreeNode<Integer> root, int x) {

        // Write your code here
        int floor = -1;

        while(root!= null){
            if(root.data <= x){
                root = root.right;
            }else{
                floor = root.data;
                root = root.left;
            }
            
        }

        return floor;

    }
	
}