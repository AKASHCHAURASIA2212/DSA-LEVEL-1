import java.io.*;
import java.util.*;

public class Main {
    
    public static int zero_one_knapsack(int[] val ,int[] wt,int cap)
    {
        int n = val.length;
        int[][]dp = new int[n+1][cap+1];
        
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    int nocall = dp[i-1][j];
                    int yescall=0;
                    if(j-wt[i-1]>=0)
                    {
                        yescall=dp[i-1][j-wt[i-1]]+val[i-1];
                    }
                    dp[i][j]=Math.max(nocall,yescall);
                }
                
            }
        }
        return dp[n][cap];
    }

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] val = new int[n];
         for(int i=0;i<n;i++)
         {
             val[i]=sc.nextInt();
         }
         int[] wt = new int[n];
         for(int i=0;i<n;i++)
         {
             wt[i]=sc.nextInt();
         }
         
         int cap = sc.nextInt();
         
         int ans = zero_one_knapsack(val,wt,cap);
         System.out.println(ans);
    }
}