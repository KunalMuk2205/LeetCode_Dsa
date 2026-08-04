class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0;
        for(int fast=1;fast<n;fast++){
            if(nums[slow]!=nums[fast]){
                nums[slow+1] = nums[fast];
                slow++;
            }
        }
        return slow+1;
    }
}