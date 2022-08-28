import java.io.*;
import java.util.*;

public class Main2 {
    
    public static boolean tarSumSS(int[] arr,boolean[][] dp){
        int n=dp.length;
        int m=dp[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                {
                    dp[i][j]=true;
                }
                else if(i==0)
                {
                    dp[i][j]=false ;
                }
                else
                {
                    // no call 
                     
                     boolean nocall = dp[i-1][j] ;
                     
                     // yes call 
                     
                     boolean yescall  = false ;
                     
                     if(j-arr[i-1]>=0)
                     {
                         yescall = dp[i-1][j-arr[i-1]] ;
                     }
                     
                    dp[i][j] = nocall || yescall  ;
                }
            }
        }
        
        return dp[n-1][m-1];
    }

   public static void display(boolean[][] arr)
    {
           for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        // boolean ans = TSS(arr,0,tar);
        boolean[][] dp = new boolean[n+1][tar+1];
        boolean ans = tarSumSS(arr,dp);
        display(dp);
        System.out.println(ans);
    }
    
    // public static boolean TSS(int[] arr,int idx ,int tar)
    // {
    //     if(tar==0)
    //     {
    //         return true ;
    //     }
    //     if(idx==arr.length || tar<0)
    //     {
    //         return false;
    //     }
        
    //     // yes call
        
    //     boolean rec1 = TSS(arr,idx+1,tar-arr[idx]);
    //     if(rec1)return true;
    //     // no call
    //     boolean rec2 = TSS(arr,idx+1,tar);
    //     if(rec2)return true;
        
    //     return false ;
        
    // }
    
    
}