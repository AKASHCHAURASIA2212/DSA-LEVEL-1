public class Main {
    
 public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node==null)
    {
        return null;
    }
    
    if(node.data==data)
    {
        ArrayList<Integer>  AL = new ArrayList<>();
        AL.add(data);
        return AL;
    }
    
    ArrayList<Integer> myrecAns = new ArrayList<>() ;
    
    for(Node c : node.children) {
        myrecAns = nodeToRootPath(c,data);
        
        if(myrecAns.size()!=0)
        {
            myrecAns.add(node.data);
            return myrecAns;
        }
    }
    
    
    
    return myrecAns;
 }
}
