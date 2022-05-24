public class MAin {
    public static boolean areSimilar(Node n1, Node n2) {
        // write your code here
        if(n1.children.size()!=n2.children.size())
        {
            return false;
        }
        boolean temp = false;
        for(int i = 0 ; i<n1.children.size()-1;i++)
        {
            temp = areSimilar(n1.children.get(i),n2.children.get(i));
            if(!temp)
            {
                return false;
            }
        }
        
        return true;
        
      }
}
