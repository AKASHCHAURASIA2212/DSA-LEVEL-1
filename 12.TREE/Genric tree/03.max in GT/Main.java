public class Main {
    public static int max(Node node) {
        // write your code here
        int max  = Integer.MIN_VALUE;
        
        for(Node c  : node.children)
        {
            int mymax = max(c);
            if(mymax>max)
            {
                max=mymax;
            }
        }
        return node.data > max ? node.data : max; 
}
