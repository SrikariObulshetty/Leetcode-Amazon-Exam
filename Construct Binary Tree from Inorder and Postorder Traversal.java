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
    public TreeNode createTree(int [] in, int [] post, int idx[], int l, int h, HashMap<Integer,Integer>map){

      if(l > h){
         return null;
      }
      int curr=post[idx[0]];
      idx[0]--;
      TreeNode node=new TreeNode(curr, null, null);
      int inIdx=map.get(curr);
      node.right = createTree(in, post, idx, inIdx+1, h, map);
      node.left=createTree(in, post, idx, l, inIdx-1,map);
      return node;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=postorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i], i);
        }
        int idx[]=new int[1];
        idx[0]=n-1;
        return createTree(inorder, postorder, idx, 0, n-1, map);


    }
}
