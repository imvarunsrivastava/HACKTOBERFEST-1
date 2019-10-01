/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int c;
    public int distributeCoins(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        
        c = 0;
        dfs(root);
        return c;
    }

    
    
    public int dfs(TreeNode r) {
        if(r == null) return 0;
        int delta = 0;
        delta = dfs(r.left) + dfs(r.right);
       
        int val = r.val + delta -1;
        if(val < 0) c-= val;
        else c+=val;
        return val;
        
    }
}
