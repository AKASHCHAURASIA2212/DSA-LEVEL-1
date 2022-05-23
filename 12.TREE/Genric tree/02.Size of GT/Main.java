public class Main {
    public static int size(Node node){
        // write your code here
           int size = 0;
        
        for(Node child : node.children)
        {
            size+=size(child);
        }
        
        return size+1 ;
      }
}
