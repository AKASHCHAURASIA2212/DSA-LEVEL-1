class Solution {
    
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};

    public void jump(int i,int j,char[][] grid)
    {
        grid[i][j]='0';
        
        for(int d[] : dir)
        {

            int row = i  +  d[0];
            int col = j  +  d[1];
            
            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]=='1')
            {
               jump(row,col,grid);
            }
        
        }
     
        
    }
    public int numIslands(char[][] grid) {
        int count = 0 ;
        for(int i = 0 ; i < grid.length; i++)
        {
           for(int j =0 ;j<grid[0].length;j++)
           {
               if(grid[i][j]=='1')
               {
                  count++;
                   jump(i,j,grid);
               }
           }
        }
        
        return count;
        
    }
}