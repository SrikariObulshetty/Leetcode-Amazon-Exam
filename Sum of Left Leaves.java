class Solution {
    public int sumLeft(TreeNode root, boolean flag){
         if(root==null){
           return 0;
        }
        if(root.left==null && root.right==null && flag==true){
            return root.val; // it is left leaf
        }
        int left=sumLeft(root.left, true);
        int right=sumLeft(root.right, false);
         return left + right;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        
        return sumLeft(root, false);
    }
}
