public class Main {
    public static boolean find(Node node, int data) {
        // write your code here
        if(node.data==data)
        {
            return true;
        }
        
        for(Node child : node.children)
        {
             if(child.data==data)
             {
            return true;
             }
        }
        boolean ans = false;
          for(Node child : node.children)
        {
            ans = find(child,data);
            if(ans)
            {
                return ans;
            }
            
        }
        
        return false;
      }
}
