class Solution {
    public int findContentChildren(int[] g, int[] s) {

        if(g.length == 0 || s.length == 0) return 0;
        Arrays.sort(s);
        Arrays.sort(g);

        int l = 0;
        int r = 0;

        while(l<g.length && r<s.length){
            if(s[r]>=g[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}