class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int small = nums[0];
        int large = nums[n-1];

        int j=0;
        for(int i=small;i<=large;i++){
            if (j < nums.length && nums[j] == i) {
                j++; 
            } else {
                ans.add(i);
            }
        }
        return ans;
    }
}