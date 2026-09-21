class Solution {
    public int longestConsecutive(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;

        if(nums.length==0) return  0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){

            if(nums[i]==prev) continue;

            if(nums[i] != prev+1){
                prev = nums[i];
                count = 1;
            }
          
            else if(nums[i] == prev +1){
                count++;
                prev = nums[i];
                longest = Math.max(count,longest);
            }
        }

        return longest;
    }
}