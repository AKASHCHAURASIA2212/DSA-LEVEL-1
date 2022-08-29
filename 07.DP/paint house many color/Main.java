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
    
    public static int minVal(int arr[][] ,int i , int x){
        int min = Integer.MAX_VALUE ;
        for(int j=0;j<arr[0].length;j++){
            // System.out.print(arr[i][j]);
            if(j!=x){
                min=Math.min(min,arr[i][j]);
            }
        }
        // System.out.println();
        // System.out.println(min);
        
        
        
        return min;
    }
    public static int PaintHouse(int[][] arr){
        int n = arr.length ;
        int k = arr[0].length ;
        int[][] dp = new int[n][k];
        
        for(int i=0;i<k;i++){
            dp[0][i] = arr[0][i];
        }
        
        for(int i=1;i<n;i++) {
            for(int j=0;j<k;j++){
              int min = minVal(dp,i-1,j);
              dp[i][j] = arr[i][j] + min ;
            }
        }
        // display(dp);
        int ans = (int)1e9;
        for(int i=0;i<k;i++){
            ans = Math.min( ans , dp[n-1][i] ) ;
        }
        return ans ;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] arr = new int[n][k] ;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int ans = PaintHouse(arr);
        System.out.print(ans);
    }
}