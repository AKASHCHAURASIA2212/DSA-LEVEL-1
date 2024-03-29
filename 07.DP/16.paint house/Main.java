import java.io.*;
import java.util.*;

public class Main {
      public static void display(int[][] arr)
    {
           for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"         ");
            }
            System.out.println();
        }
    }
    public static int PaintHouse(int[][] arr){
        int n = arr.length ;
        int[][] dp = new int[n][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        for(int i=1;i<n;i++) {
            for(int j=0;j<3;j++){
              if(j==0){
                  dp[i][j] = Math.min( dp[i-1][j+1] , dp[i-1][j+2]) + arr[i][j];
              } else if(j==1)
              {
                  dp[i][j] = Math.min( dp[i-1][j-1] , dp[i-1][j+1]) + arr[i][j];
              }else{
                  dp[i][j] = Math.min( dp[i-1][j-1] , dp[i-1][j-2]) + arr[i][j];
              }
            }
        }
        // display(dp);
        return Math.min( dp[n-1][0] , Math.min( dp[n-1][1],dp[n-1][2]) ) ;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3] ;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int ans = PaintHouse(arr);
        System.out.print(ans);
    }
}