class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int prefixSum = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int remaining = prefixSum-k;

            if(map.containsKey(remaining)){
                count = count + map.get(remaining);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}