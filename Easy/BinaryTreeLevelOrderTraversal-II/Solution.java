/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        dfs(result,root,0);
        
        return result;
        
    }
    
    void dfs(List<List<Integer>> temp, TreeNode node, int depth)
    {
        if(node==null) return;
        
        if(temp.size()==depth) temp.add(0,new ArrayList<Integer>());
        
        int maxDepth=temp.size();
        
        temp.get(maxDepth-1-depth).add(node.val);
        
        dfs(temp,node.left,depth+1);
        dfs(temp,node.right,depth+1);
        
    }
    
}