import java.io.*;
import java.util.*;

public class Main {

public static int Taling(int n ){
    int[] dp = new int[n];
    dp[0]=1;
    dp[1]=2;
    
    for(int i=2;i<n;i++)
    {
        dp[i] = dp[i-1]+dp[i-2] ;
    }
    return dp[n-1] ;
}
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int ans = Taling(Num);
        System.out.println(ans);
    }
}