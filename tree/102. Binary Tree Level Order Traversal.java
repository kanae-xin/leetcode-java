class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> cur = new ArrayList<>();
            int length = queue.size();
            for(int i=0; i< length; i++){
                TreeNode n = queue.remove();
                cur.add(n.val);
                if(n.left!=null)
                    queue.add(n.left);
                if(n.right!=null)
                    queue.add(n.right);
            }
            
            res.add(cur);
        }
        return res;
    }
}
/* 
每经过一个结点,把子节点压进queue里.
如何判断当前层全部遍历完?每一层都把当层节点压进去了,判断queue的长度->多少次
-----
Better solution
-----
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    private void helper(TreeNode root, int level){
        //start the current level
        //check if the size of levels is equal to the current level
        if(levels.size() == level){
            //create a new list into levels if not
            levels.add(new ArrayList<Integer>());
        }
        //add the value of the node into the level list
        levels.get(level).add(root.val);
        //Process child nodes for the next level
        if(root.left != null){
            helper(root.left, level + 1);
        }
        if(root.right != null){
            helper(root.right, level+1);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        //check if the root is null
        if(root == null){
            return levels;
        }
        helper(root, 0);
        return levels;
    }
每次遍历判断层数,然后在对应层插入
*/