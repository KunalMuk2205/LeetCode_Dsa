class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int lessEqualk = solve(nums,k);
        int lessK = solve(nums,k-1);
        int ans = lessEqualk - lessK;
        return ans;
    }
    public int solve(int nums[], int k){
        int l=0;
        int r=0;
        int count =0;
        int ans = 0;

        while(r < nums.length){
            if(k<0) return 0;

            if(nums[r] % 2 != 0) count++;

            while(count > k){
                if(nums[l] %2 != 0){
                    count--;
                }
                l++;
            }

            ans = ans + (r-l+1);
            r++;
        }
        return ans;
    }
}