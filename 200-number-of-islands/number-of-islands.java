class Solution { 
    class Pair{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;  int count = 0;

        int vis[][] = new int[n][m];
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] != 1 && grid[i][j] == '1'){
                    bfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int row, int col, int vis[][], char grid[][]){
        
        int n = grid.length;
        int m = grid[0].length;

        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row,col));

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.poll();

            for(int delrow = -1; delrow <= 1; delrow++){
                for(int delcol =-1; delcol <=1; delcol++){

                    if(delrow != 0 && delcol != 0)
                        continue;
                        
                    int nrow = r + delrow;
                    int ncol = c + delcol;

                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                    vis[nrow][ncol] != 1 && grid[nrow][ncol] == '1'){
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
}