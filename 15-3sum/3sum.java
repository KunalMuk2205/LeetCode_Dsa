class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int target = -(nums[i]+nums[j]);

                if(set.contains(target)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(target);

                    Collections.sort(list);
                    ans.add(list);
                }else{
                    set.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}