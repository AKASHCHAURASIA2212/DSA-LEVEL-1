public class MAin {
    public static int kthLargest(Node node, int k){
      
      
        int data = Integer.MAX_VALUE;
        
        for(int i=1;i<=k;i++)
        {
           ceilAndFloor(node,data);
           data = floor;
           
           floor = Integer.MIN_VALUE;
        //   System.out.println(data);
        }
        
        return data;
      }
}
