import java.io.*;
import java.util.*;

public class Main {
    
    

    //  public static int[][] sort2d(int[][] arr)
    //  {
    //      int n = arr.length;
         
    //      int[][] arr2 = new int[n][2];
         
    //      int[] row = new int[n];
         
    //      for(int i=0;i<n;i++ )
    //      {
    //          row[i]=arr[i][0];
    //      }
         
    //      Arrays.sort(row);
         
    //      for(int i=0;i<n;i++)
    //      {
    //          int idx = find(row[i],arr);
    //          arr2[i][0]=arr[idx][0];
    //          arr2[i][1]=arr[idx][1];
    //      }
         
    //      return arr2;
         
    //  }
     
    //  public static int find(int item,int[][] arr)
    //  {
    //       for(int i=0;i<arr.length;i++)
    //      {
    //          if(arr[i][0]==item)
    //          {
    //              return i;
    //          }
    //      } 
    //      return -1;
    //  }
     
     
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }
        
        // int[][] arr2 = sort2d(arr);
        
        
        // Display(arr2);
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
        mergeOverlappingIntervals(arr);
    }
    
    public static void Display(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("i "+arr[i][0]+" "+arr[i][1]);
        }
    }
    
    public static class interval
    {
            int i1;
            int i2;
            interval(){}
            interval(int i1,int i2)
            {
              this.i1=i1;
              this.i2=i2;
            }
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Stack<interval> st = new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
              interval val = new interval(arr[i][0],arr[i][1]);
              st.push(val);    
            }
            else
            {
                interval peek = st.peek();
                // System.out.println("peek-->"+peek.i1+" "+peek.i2);
                if(peek.i2>=arr[i][0])
                {
                    if(peek.i2<=arr[i][1])
                    {
                       interval val = new interval(st.peek().i1,arr[i][1]);
                    st.pop();
                    st.push(val);  
                    }
                   
                }
                else
                {
                 interval val = new interval(arr[i][0],arr[i][1]);
                 st.push(val);
                }
            }
          
        }
        interval[] ran = new interval[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
            ran[i]=st.pop();
        }
        
        for(int i=0;i<ran.length;i++)
        {
            System.out.println(ran[i].i1+" "+ran[i].i2);
        }
        
    }

}