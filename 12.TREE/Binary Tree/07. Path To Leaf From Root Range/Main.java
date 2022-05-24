public class Main {
    public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
        // write your code here
        if(node.left==null && node.right==null)
        {
            sum=sum+node.data;
            path+=node.data+" ";
            if(sum>=lo && sum<=hi)
            {
                System.out.println(path);
                return;
            }
            return;
        }
        
        // left call
        if(node.left!=null)
        {
          pathToLeafFromRoot(node.left,path+node.data+" ",sum+node.data,lo,hi); 
        }
        //rightcall
        if(node.right!=null)
        {
        pathToLeafFromRoot(node.right,path+node.data+" ",sum+node.data,lo,hi);    
        }
    
      }
    
}
