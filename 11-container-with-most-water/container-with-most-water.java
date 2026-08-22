class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int j = n-1; int ans = 0;

        while(i<j){
            int width = j-i;
            int heights = Math.min(height[i],height[j]);
            int area = heights*width;
            ans = Math.max(area,ans);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}