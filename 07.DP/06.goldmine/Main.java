import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    
    int arr[][]=new int[n][m];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
    
   int dp[][] = new int[n][m];
   
    
   
      for(int j=m-1;j>=0;j--)
    {
       for(int i=n-1;i>=0;i--)
        {
            if(j==m-1)
            {
                dp[i][j]=arr[i][j];
            }
            else if(i==n-1)
            {
                int d1 = dp[i-1][j+1];
                int d2 = dp[i][j+1];
                int d3 = 0;
                int max = Math.max(d1,d2);
                dp[i][j]=max+arr[i][j];
            }
                else if(i==0)
            {
                int d1 = 0 ;
                int d2 = dp[i][j+1];
                int d3 = dp[i+1][j+1];
                int max = Math.max(d3,d2);
                dp[i][j]=max+arr[i][j];
            }
            else{
                int d1 = dp[i-1][j+1];
                int d2 = dp[i][j+1];
                int d3 = dp[i+1][j+1];
                int max = Math.max(d3,Math.max(d2,d1));
                dp[i][j]=max+arr[i][j];
            }
        }
        
    
    }
    
        int max=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=0;j++)
        {
            if(dp[i][j]>max){
                max=dp[i][j];
            }
            
        }
    }
    
    //   for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         System.out.print(dp[i][j]+" ");
    //     }
    //     System.out.println();

    // }
    
    System.out.println(max);
    
    
    
    
    
    
    }

}