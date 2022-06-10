import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean targetSumSS(int[] arr,int idx,int tar)
    {
        if(idx==arr.length)
        {
            if(tar==0){
                return true;
            }
            return false;
        }
    
        
        boolean yescall = targetSumSS(arr,idx+1,tar-arr[idx]);
        boolean nocall = targetSumSS(arr,idx+1,tar);
        
        return (yescall || nocall ) ;

    }
    
    public static boolean targetSumSS(int arr[] ,boolean[][] dp)
    {
        int n = dp.length;
        int m = dp[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(i==0)
                {
                    dp[i][j]=false;
                }
                else if(j==0)
                {
                    dp[i][j]=true;
                }
                else{
                    boolean nocall = dp[i-1][j];
                    boolean yescall=false;
                    if(j-arr[i-1]>=0)
                    {
                        yescall = dp[i-1][j-arr[i-1]];
                    }
                    
                    dp[i][j]=(yescall || nocall);
                }
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) throws Exception {
            Scanner s = new Scanner(System.in);
            int n= s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
            arr[i]=s.nextInt();
            }
            int tar = s.nextInt();
            boolean [][]dp = new boolean[n+1][tar+1];
            boolean ans = targetSumSS(arr,dp);
            // boolean ans = targetSumSS(arr,0,tar);

            System.out.println(ans);
    }
}
