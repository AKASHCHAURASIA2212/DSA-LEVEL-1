public class Main {
    public static int height(Node node) {
        // write your code here
        if(node==null)
        {
            return -1;
        }
        int ht = -1 ; 
         for (Node child : node.children) {
          int myht = height(child);
          if(myht>ht)
          {
              ht=myht;
          }
        }
        return ht+1;
        
      }
    
}
