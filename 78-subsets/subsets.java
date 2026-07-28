class Solution {

    ArrayList<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> current = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        solve(0,nums);
        return ans;
    }

    public void solve(int index, int nums[]){
        if(index == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        solve(index+1,nums);

        current.remove(current.size()-1);

        solve(index+1,nums);
    }
}