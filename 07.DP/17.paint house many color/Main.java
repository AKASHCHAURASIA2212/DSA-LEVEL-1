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


    public static int PaintHouseW(int[][] arr){
        int n = arr.length ;
        int k = arr[0].length ;
        int[][] dp = new int[n][k];
        
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        
        for(int i=0;i<k;i++){
            if(arr[0][i]<least){
                sleast = least;
                least = arr[0][i];
            }else if(arr[0][i]<sleast){
                sleast = arr[0][i];
            }
            dp[0][i] = arr[0][i];
        }
        
        for(int i=1;i<n;i++) {
            
            for(int j=0;j<k;j++){
                int nleast = Integer.MAX_VALUE ;
                int nsleast = Integer.MAX_VALUE ;
              if(least == dp[i-1][j]){
                  dp[i][j]=arr[i][j]+sleast ;
              }
              else{
                  dp[i][j]=arr[i][j]+least ; 
              }
              
              if(dp[i][j]<nleast){
                 nsleast = nleast ;
                 nleast = dp[i][j] ;
              }else if(dp[i][j]<nsleast){
                  nsleast = dp[i][j];
              }
              
              least = nleast ;
              sleast = nsleast ;
            }
        }
        // display(dp);
        return least ;
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