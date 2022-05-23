public class Main {
    public static void reverse (ArrayList<Node> list)
    {
        int i = 0 ;
        int j = list.size()-1;
        
        while(i<=j)
        {
          
          Node v1 = list.get(i);
          Node v2 = list.get(j);
          
          list.set(i,v2);
          list.set(j,v1);
            i++;
            j--;
        }
    }
    public static void mirror(Node node){
         
         for(Node child : node.children)
         {
             mirror(child);
         }
         
         reverse(node.children);
      
      
    }
}
