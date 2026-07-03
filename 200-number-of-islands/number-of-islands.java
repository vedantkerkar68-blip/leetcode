class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1')
                cnt++;
                makeZero(grid,i,j);
            }
        }
        return cnt;
    }
    public static void makeZero(char[][] grid,int r,int c){
        if(r>=grid.length || c>=grid[0].length || r<0 || c<0 || grid[r][c]=='0') return;
        grid[r][c]='0';
        makeZero(grid,r-1,c);
        makeZero(grid,r+1,c);
        makeZero(grid,r,c+1);
        makeZero(grid,r,c-1);
    }
}