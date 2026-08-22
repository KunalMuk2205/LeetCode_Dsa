class Solution {
    public int maxArea(int[] height) {
        int n = height.length; int ans = 0;
        int i=0;
        int j = n-1;

        while(i<j){
            int width = j-i;
            int heights = Math.min(height[i],height[j]);
            int area = width * heights;
            ans =Math.max(ans,area);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
       return ans;
    }
}