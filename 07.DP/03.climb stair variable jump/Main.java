import java.io.*;
import java.util.*;

public class Main {
    
    public static int solve(int[]arr ,int sr , int dest)
    {
        if(sr==dest)
        {
            return 1;
        }
        
        int count=0;
        for(int jump=1;jump<=arr[sr]&&jump+sr<=dest;jump++)
        {
            count+=solve(arr,sr+jump,dest);
        }
        return count;
    }
    
    // memoization 
    
        public static int solveM(int[]arr ,int sr , int dest,int[] dp)
    {
        if(sr==dest)
        {
            return dp[sr]=1;
        }
        
        if(dp[sr]!=0)
        {
            return dp[sr];
        }
        
        int count=0;
        for(int jump=1;jump<=arr[sr]&&jump+sr<=dest;jump++)
        {
            count+=solve(arr,sr+jump,dest);
        }
        return dp[sr]=count;
    }
    
    // tabulation
    public static int solveT(int[]arr ,int sr , int dest,int[] dp)
    {
        for(int n=dest;n>=sr;n--)
        {
                if(n==dest)
                {
                    dp[n]=1;
                    continue;
                }
                
                int count=0;
                for(int jump=1;jump<=arr[n]&&jump+n<=dest;jump++)
                {
                    count+=  dp[jump+n];//solve(arr,sr+jump,dest);
                }
            dp[n]=count;
        }
        return dp[sr];
 
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] dp = new int[n+1];
        
        // int ans = solve(arr,0,arr.length);
        // int ans = solveM(arr,0,arr.length,dp);
        int ans = solveT(arr,0,arr.length,dp);
        System.out.println(ans);
        
    }

}