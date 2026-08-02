class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int index = 0;
        
        solve(0, nums, n);
        return ans;
    }
    public void solve(int index, int arr[], int n){
        if(index>=n){
            ans.add(new ArrayList<Integer>(current));
            return;
        }
        current.add(arr[index]);
        solve(index+1, arr, n);

        current.remove(current.size()-1);

        solve(index+1, arr, n);
    }
}