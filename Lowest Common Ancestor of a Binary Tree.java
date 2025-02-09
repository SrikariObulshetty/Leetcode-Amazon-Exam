class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root==null || root==p || root==q){
            return root;
         }
         TreeNode left=lowestCommonAncestor(root.left, p,q);
         TreeNode right=lowestCommonAncestor(root.right, p,q);

         if(left!=null && right!=null){
             // both r found in diff sides of tree.
             return root;
         }
         if(left!=null){
            return left;
         }
         return right;

    }
}
