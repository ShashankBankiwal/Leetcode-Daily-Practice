/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    StringBuilder str = new StringBuilder("");
    public String tree2str(TreeNode root) {
        // while(root!=null) {
        //     if(root.left!=null) {
        //         str.concat("("+root.left+")");
        //         root = root.right;
        //     } 
        //     else if(root.right!=null) {
        //         str.concat("("+root.right+")");
        //         root = root.left;
        //     }
        // }
        String str = calculateString(root);
        return str;
    }
    public String calculateString(TreeNode root) {
        if(root == null) {
            return "";
        }
        if(root.left==null && root.right ==null) {
            return root.val + "";
        }
        if(root.right==null) {
            return root.val + "("+calculateString(root.left)+")";
        } else {
            return root.val + "(" + calculateString(root.left) + ")"
                + "(" +calculateString(root.right)+ ")";
        }
    }
}