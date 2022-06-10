import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
          if(sr==maze.length-1 && sc==maze[0].length-1)
          {
              System.out.println(asf);
          }
          // top move
          if(sr-1>=0 &&maze[sr-1][sc]!=1)
          {
              String myasf = asf+"t";
              maze[sr][sc]=1;
              floodfill(maze,sr-1,sc,myasf);
              maze[sr][sc]=0;
          }
          //left move
            if(sc-1>=0 &&maze[sr][sc-1]!=1)
          {
              String myasf = asf+"l";
              maze[sr][sc]=1;
              floodfill(maze,sr,sc-1,myasf);
              maze[sr][sc]=0;
          }
          
          // down move
            if(sr+1<=maze.length-1 &&maze[sr+1][sc]!=1)
          {
              String myasf = asf+"d";
              maze[sr][sc]=1;
              floodfill(maze,sr+1,sc,myasf);
              maze[sr][sc]=0;
          }
          // right move
            if(sc+1<=maze[0].length-1 &&maze[sr][sc+1]!=1)
          {
              String myasf = asf+"r";
              maze[sr][sc]=1;
              floodfill(maze,sr,sc+1,myasf);
              maze[sr][sc]=0;
          }
    }
}