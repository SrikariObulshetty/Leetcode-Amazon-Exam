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
    public int sum(TreeNode root, int bin){
        if(root==null){
            return 0; // not bin
        }
        bin=(bin * 2) + root.val;
        if(root.left==null && root.right==null){
            return bin;
        }

        int left=sum(root.left, bin);
        int right = sum(root.right, bin);
       
        return right + left;

    }
    public int sumRootToLeaf(TreeNode root) {
          return sum(root,0);
    }
}
