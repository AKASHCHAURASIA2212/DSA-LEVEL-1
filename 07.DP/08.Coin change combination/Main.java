import java.io.*;
import java.util.*;

public class Main {

   public static int coinChangeCombination(int[] arr ,int amt){
        int[] dp = new int[amt+1];
        dp[0]=1;
        
        for(int i=0;i<arr.length;i++)
        {
            int val = arr[i];
            
            for(int j=val;j<dp.length;j++)
            {
                dp[j]=dp[j-val] +dp[j];
            }
        }
        
        return dp[amt];
    }

    
public static int CCC(int[] arr,int dp[])
{
    dp[0]=1;
    int n=dp.length;
    int m=arr.length;
    for(int i=0;i<m;i++)
    {
         for(int j=arr[i];j<n;j++)
         {
            int precoin = j-arr[i];
            dp[j]=dp[j]+dp[precoin];
         }
    }
    return dp[n-1];
   
}
    public static void main(String[] args) throws Exception {
         Scanner s = new Scanner(System.in);
            int n= s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
            arr[i]=s.nextInt();
            }
            int amt = s.nextInt();
            int []dp = new int[amt+1];
            int ans = CCC(arr,dp);
            System.out.println(ans);
    }
}