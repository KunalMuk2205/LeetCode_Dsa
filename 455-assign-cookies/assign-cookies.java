class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;

        if(m==0 || n==0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int l=0,r=0;

        while(l<n && r<m){
            if(s[l]>=g[r]){
                r++;
            }
            l++;
        }
        return r;
    }
}