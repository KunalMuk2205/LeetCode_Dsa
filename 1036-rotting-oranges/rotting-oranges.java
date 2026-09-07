class Solution {
    class Pair{
        int first;
        int second;
        int time;

        Pair(int first, int second, int time){
            this.first = first;
            this.second = second;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length; 
        int vis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<Pair>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 0;
                }
            }
        }

        int tm=0;
        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,-1,0,1};

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().time;

            q.poll();

            tm = Math.max(t,tm);

            for(int i=0;i<4;i++){
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];

                if(nrow >=0 && nrow < n && ncol >=0 && ncol < m
                && vis[nrow][ncol] !=2 && grid[nrow][ncol] == 1){
                    vis[nrow][ncol] = 2;
                    q.add(new Pair(nrow,ncol,t+1));
                }
            }

        }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(vis[i][j] != 2 && grid[i][j] == 1) return -1;
        }
       }
       return tm;
    }
}