class Solution {
    public boolean isValidBST(TreeNode root) {
        return help(root).isbst;
    }

    public class isBST{
        int min;
        int max;
        boolean isbst;
        isBST() {}
        isBST(int min, int max, boolean isbst){
            this.min = min;
            this.max = max;
            this.isbst = isbst;
        }
    }

    public isBST help(TreeNode root){
        isBST leftBST = null;
        isBST rightBST = null;
        if(root.left == null && root.right == null)
            return new isBST(root.val, root.val, true);
        else if(root.left != null){
            leftBST = help(root.left);
            if(leftBST.isbst){
                if(root.right != null){
                   rightBST = help(root.right);
                   if(rightBST.isbst && rightBST.min > root.val && root.val > leftBST.max)
                        return new isBST(leftBST.min, rightBST.max, true);
                    else
                        return new isBST(leftBST.min, root.val, false);
                }
                else if(root.val > leftBST.max)
                    return new isBST(leftBST.min, root.val, true);
                else
                    return new isBST(leftBST.min, root.val, false);

            }
            else
                return new isBST(root.val, root.val, false);
        }
        else{
            rightBST = help(root.right);
            if(rightBST.isbst && rightBST.min > root.val)
                return new isBST(root.val, rightBST.max, true);
            else
                return new isBST(root.val, root.val, false);
        }
    }
}
/*
Better solution:
Instead of passing an object, but use boolean.
Use Integer, so that can check if min/max is null
---------
    public boolean isValidBST(TreeNode root) {

        return dfs(root, null, null);
        
    }

    public boolean dfs(TreeNode root, Integer min, Integer max)
    {
        if(root == null)
        return true;

        if(min != null && root.val >= min)
        {
        return false;
        }

        if(max != null && root.val <= max)
        {
        return false;
        }

         return (dfs(root.left, root.val, max) && dfs(root.right, min, root.val));

    }
*/