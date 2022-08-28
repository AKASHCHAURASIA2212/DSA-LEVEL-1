//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    long mod = (int)1e9+7;
    public int TotalWays(int N)
    {
        long zero = 0 ;
        long one = 1 ;
        for(int i=0;i<N;i++)
        {
            long newzero = one ;
            long newone = (one + zero)%mod;
            
            one = newone ;
            zero = newzero ;
        }
        long ans = (one+zero)%mod;
        ans = (ans*ans) ;
        return (int)(ans%mod);
    }
}