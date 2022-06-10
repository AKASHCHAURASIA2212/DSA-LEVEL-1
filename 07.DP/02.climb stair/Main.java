import java.io.*;
import java.util.*;

public class Main {
    
    // recursive approch of climb stair
    public static int csp(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        
        int p1 = csp(n-1);
        int p2 = csp(n-2);
        int p3 = csp(n-3);
        
        int mypath = p1+p2+p3;
        return mypath;
    }
    
    //  memoization 
    
        public static int csp(int n ,int[] dp)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return dp[n]=1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        int p1 = csp(n-1);
        int p2 = csp(n-2);
        int p3 = csp(n-3);
        
        int mypath = p1+p2+p3;
        return  dp[n]=mypath;
    }
    
    // tabulation
    
    public static int cspT(int N ,int[] dp)
    {
        for(int n=0;n<dp.length;n++)
        {
            if(n==0)
            {
                    dp[n]=1;
                    continue;
            }
               
               int p1=0;
               if(n-1>=0)
               {
                    p1 =  dp[n-1];
               }
               int p2=0;
               if(n-2>=0)
               {
                   p2 =  dp[n-2];
               }
               int p3=0;
               if(n-3>=0)
               {
                   p3 =  dp[n-3];
               }
             
                int mypath = p1+p2+p3;
                 dp[n]=mypath;
         }
         return dp[N];
    
    }

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner dc = new Scanner(System.in);
    int n = dc.nextInt();
    int[] dp = new int[n+1];
    Arrays.fill(dp,-1);
    // int ans = csp(n);
    int ans = cspT(n,dp);

    System.out.println(ans);
    }

}