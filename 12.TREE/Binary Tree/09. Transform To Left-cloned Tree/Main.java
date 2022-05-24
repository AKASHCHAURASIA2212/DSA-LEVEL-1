public class Main {
    public static Node createLeftCloneTree(Node node){
        // write your code here
        if(node==null)
        {
            return null;
        }
        
        Node left  = createLeftCloneTree(node.left);
        
        Node right  = createLeftCloneTree(node.right);
        
        Node myself = new Node(node.data,null,null);
        
        
       Node temp = node.left;
       node.left = myself;
       myself.left = temp;
        
        return node;
        
      }
}
