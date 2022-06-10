import java.io.*;
import java.util.*;

public class Main{
    // normal recursion call
    public static int fibbo(int n)
    {
        if(n==1 || n==0)
        {
            return n ; 
        }
        
        int f1 = fibbo(n-1);
        int f2 = fibbo(n-2);
        
        return (f1+f2);
    }
    
//    memoization recursion call
       public static int fibboM(int n,int[] dp)
    {
        if(n==1 || n==0)
        {
            return dp[n]=n ; 
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        else
        {
        int f1 = fibbo(n-1);
        int f2 = fibbo(n-2);
        return dp[n]=(f1+f2);
        }
    }
    
          public static int fibboT(int N,int[] dp)
    {
        // three step to convert memoization to tabulation
        // 1. remove return write continue
        // 2. remove mamoization
        // 3.dont call function ask to dp
        
        for(int n=0;n<dp.length;n++)
        {
              if(n==1 || n==0)
                {
                    dp[n]=n ;
                    continue;
                }

                int f1 =  dp[n-1]; //fibbo(n-1);
                int f2 = dp[n-2] ;//fibbo(n-2);
                dp[n]=(f1+f2);
        
        }
        
        return dp[N];
        
      
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner dc = new Scanner(System.in);
    int n = dc.nextInt();
    int[] dp = new int[n+1];
    Arrays.fill(dp,-1);
    // int ans = fibboM(n ,dp);
    int ans = fibboT(n ,dp);

    System.out.println(ans);
 }

}