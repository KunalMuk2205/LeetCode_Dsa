class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = candidates.length;

        solve(0,n,candidates,target,ans,list);
        return ans;
    }
    public void solve(int i, int n, int candidates[], int target, List<List<Integer>> ans, ArrayList<Integer> list){
        if(i==n){
                if(target == 0) {
                ans.add(new ArrayList<>(list));
                }
                return;
        }
        
        if(candidates[i]<=target){

            list.add(candidates[i]);
            solve(i,n,candidates,target-candidates[i],ans,list);
            list.remove(list.size()-1);

        }

        solve(i+1,n,candidates,target,ans,list);

    }
}