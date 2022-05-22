// Method 1 isbst

class Solution {
    public class Bstpair{
         boolean stat;
         int min;
         int max;
        public Bstpair(){};
        public Bstpair(boolean stat,int min,int max){
            this.stat=stat;
            this.min=min;
            this.max=max;
        }
    }
    
    public Bstpair isBst(TreeNode root)
    {
       if(root==null)
       {
         return new Bstpair(true,Integer.MAX_VALUE,Integer.MIN_VALUE);
       }
        
        Bstpair left = root.left!=null?isBst(root.left) : new Bstpair(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        Bstpair right = root.right!=null ? isBst(root.right) : new Bstpair(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        Bstpair mypair = new Bstpair();
        mypair.stat = left.stat && right.stat && left.max < root.val && root.val < right.min;
        
        mypair.min = Math.min(root.val,left.min);
        mypair.max = Math.max(root.val,right.max);
        
        return mypair;
        
    }
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null)
        {
           return true;
        }
        Bstpair ans = isBst(root);
        return ans.stat;
    }


    // method 2 

    public long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        
        
        if(root==null)
        {
          return true;
        }
        
        boolean lcall =  isValidBST(root.left);
        if(lcall==false)
            return false;
        if(prev>=root.val )
        {
           return false;
        }
        
        prev = root.val;
        
        boolean rcall = isValidBST(root.right);
        
        if(rcall==false)
            return false;
        
        return true;
        
    }
}

