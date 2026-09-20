class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int i= 0;
        
        if(nums.length == 0) return  0;

        int prev = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;

        while(i<nums.length){

            if(nums[i]==prev){
                i++;
                continue;
            }

            if(nums[i] != prev+1) {
                prev = nums[i];
                count=1;
                i++;
                continue;
            }

            if(nums[i] == prev+1){
                count ++;
                prev = nums[i];
                longest = Math.max(longest,count);
                i++;
                continue;
            }
        }

        return longest;
    }
}