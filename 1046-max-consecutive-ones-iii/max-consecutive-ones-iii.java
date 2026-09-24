class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length; int zeros = 0;

        int l=0;
        int r=0;
        int maxLen = Integer.MIN_VALUE;

        while(r<n){

            if(nums[r]==0){
                zeros++;
            }

            if(zeros >k){
                while(nums[l]!=0){
                    l++;
                }
                l++;
                zeros = zeros-1;
            }

            int len = r-l+1;
            maxLen = Math.max(len,maxLen);
            r++;
        }
        return maxLen;
    }
}