class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int n = nums.length; int count = 0;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         if(sum == goal) count++;
        //     }
        // }
        // return count;
        
        int lessEqualGoal = solve(nums,goal);
        int lessGoal = solve(nums,goal-1);
        int ans = lessEqualGoal - lessGoal;
        return ans;
        
    }
    public int solve(int nums[], int goal){
        int n= nums.length;
        int l =0; int r=0;
        int sum =0; int count = 0;
        
        if(goal < 0) return 0;
        
        while(r<n){
            sum += nums[r];

            while(sum > goal){
                sum -= nums[l];
                l++;
            }

            if(sum <= goal){
                count = count + (r-l+1);
            }
            r++;
        }
        return count;
    }
}