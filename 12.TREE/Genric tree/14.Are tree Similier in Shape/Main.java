public class Main {
    public static boolean areMirror(Node n1, Node n2) {

        if(n1.children.size()!=n2.children.size())
      {
          return false;
      }
      boolean temp = false;
      int len1 = n1.children.size();
      int len2 = n2.children.size();
      int i = 0;
      int j = len2-1;
      
      while(i<len1 && j>=0)
      {
          
          Node left = n1.children.get(i);
          Node right = n2.children.get(j);
          temp = areMirror(left,right);
          if(!temp)
          {
              return false;
          }
          i++;
          j--;
      }
      
      return true;
  
      
    }
}
