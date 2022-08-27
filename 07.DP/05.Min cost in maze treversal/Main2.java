import java.io.*;
import java.util.*;

public class Main2 {


    public static int MinCost(int[][] maze ,int sr ,int sc , int dr ,int dc,int dp[][])
    {
        if(sr==dr && sc==dc)
        {
            return dp[sr][sc] = maze[dr][dc];
        }
        
        if(dp[sr][sc]!=0)
        {
            return dp[sr][sc];
        }
        // horizontal move
        int hr = Integer.MAX_VALUE;
        if(sc+1<=dc){
         hr = MinCost(maze,sr,sc+1,dr,dc,dp);
        }
    
        // vertical move
        int vr = Integer.MAX_VALUE;
        if(sr+1<=dr){
         vr = MinCost(maze,sr+1,sc,dr,dc,dp);
        }
        
        int ans = Math.min(hr,vr)+maze[sr][sc];
        
        // System.out.println(ans+"   ");
        return dp[sr][sc]=ans;
    }
    
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
    public static void main(String[] args) throws Exception {
        // write your code here
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maze[][] = new int[n][m];
        int dp[][] = new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                maze[i][j]=sc.nextInt();
            }
        }
         int ans =  MinCost(maze,0,0,n-1,m-1,dp);
      
        // display(dp);
        System.out.println(ans);
        
    }

}