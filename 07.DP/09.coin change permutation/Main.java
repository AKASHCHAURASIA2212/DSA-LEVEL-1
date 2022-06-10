import java.io.*;
import java.util.*;

public class Main {

    public static int CCC(int[] arr,int dp[])
{
    dp[0]=1;
    int n=dp.length;
    int m=arr.length;
    for(int j=0;j<n;j++)
    {
         for(int i=0;i<m;i++)
         {
            if(j-arr[i]>=0)
            {
                dp[j]+=dp[j-arr[i]];
            }
             
            // int precoin = j-arr[i];
            // dp[j]=dp[j]+dp[precoin];
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