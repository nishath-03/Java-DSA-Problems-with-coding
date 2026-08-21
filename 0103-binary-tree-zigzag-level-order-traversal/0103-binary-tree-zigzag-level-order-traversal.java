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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root == null) return new ArrayList();
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        lvlOrder(root,q);
        for(int i=1;i<res.size();i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
    void lvlOrder(TreeNode root, Queue<TreeNode>q){
        
        
        
        while(!q.isEmpty()){    
            List<Integer> temp = new ArrayList<>();
            int lvlsize = q.size();
            for(int i=0;i<lvlsize;i++){
                TreeNode t = q.poll();
                if(t!=null){
                    temp.add(t.val);
                    if(t.left !=null) q.add(t.left);
                    if(t.right != null)q.add(t.right);
                }
            }
            res.add((temp));
            
        }
        
    }   
}