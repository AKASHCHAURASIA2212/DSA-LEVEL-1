public class Main {
    static int maxsub = Integer.MIN_VALUE;
    static int maxnode = 0;
  
  //method 1
  
  // public static void maxSubTreeSum(Node root)
  // {
  //     for(Node c : root.children) 
  //     {
  //       maxSubTreeSum(c); 
  //     }
      
      
  //     int sum = 0;
  //     sum+=root.data;
  //     for(Node c : root.children) {
  //         sum+=c.data;
  //     }
      
      
      
  //     if(sum>maxsub) {
  //         maxsub=sum;
  //         maxnode=root.data;
  //     }
      
  //     root.data=sum;
  
  // }
  
  
  // method 2
  
  // public static int maxSubTreeSum(Node root)
  // {
  //      int sum = 0;
       
  //     for(Node c : root.children) 
  //     {
  //       sum+=maxSubTreeSum(c); 
  //     }
  //     sum+=root.data;
      
  //     if(sum>maxsub) {
  //         maxsub=sum;
  //         maxnode=root.data;
  //     }
      
  //     root.data=sum;
  //     return sum;
  
  // }
}
