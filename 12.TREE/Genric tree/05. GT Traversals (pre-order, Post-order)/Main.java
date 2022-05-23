public class Main {
    public static void traversals(Node node){
        // write your code here
        System.out.println("Node Pre "+node.data);
        
        for(Node c : node.children)
        {
            System.out.println("Edge Pre "+node.data+"--"+c.data);
            traversals(c);
            System.out.println("Edge Post "+node.data+"--"+c.data);
        }
        
        System.out.println("Node Post "+node.data);
    
      }
}
