import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
    //   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    //   for(int ele : arr)
    //   {
    //       pq.add(ele);
    //   }
    //   int[] ans = new int[k];
    //   while(k>0)
    //   {
    //      ans[k-1]=pq.peek();
    //      pq.remove();
    //       k--;
    //   }
      
    // for(int i=0;i<k;i++)
    // {
    //     System.out.println(ans[i]);
    // }
    
          PriorityQueue<Integer> pq = new PriorityQueue<>();
  
    for(int i=0;i<n;i++)
    {
        if(i<k)
        {
            pq.add(arr[i]);
        }
        else{
            if(pq.peek()<arr[i])
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
    }
    
    while(pq.size()>0)
    {
        System.out.println(pq.peek());
        pq.remove();
    }
    
    }
    
  

}