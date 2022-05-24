public class Main {
    public static Node transBackFromLeftClonedTree(Node node){
        if(node==null)
        {
            return null;
        }
        
        Node left  = transBackFromLeftClonedTree(node.left);
        
        Node right  = transBackFromLeftClonedTree(node.right);
        
        if( node.left!=null && node.data==node.left.data)
        {
          node.left = node.left.left;
        }
        
        
        return node;
        
      
      }
}
