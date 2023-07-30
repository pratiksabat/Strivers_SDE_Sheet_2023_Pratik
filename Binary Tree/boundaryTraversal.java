import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> traverseBoundary(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        res.add(root.data);
        left(root.left, res);
        if(root.left!=null || root.right!=null )leafnodes(root, res);
        right(root.right, res);
        return res;
    }

    public static void left(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;
        if (root.left != null) {
            res.add(root.data);
            left(root.left, res);
        } else if (root.right != null) {
            res.add(root.data);
            left(root.right, res);
        }
    }

    public static void right(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;
        if (root.right != null) {
            right(root.right, res);
            res.add(root.data);
        } else if (root.left != null) {
            right(root.left, res);
            res.add(root.data);
        }
    }

    public static void leafnodes(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;
        leafnodes(root.left, res);
        if (root.right == null && root.left == null) {
            res.add(root.data);
        }
        leafnodes(root.right, res);
    }
}
