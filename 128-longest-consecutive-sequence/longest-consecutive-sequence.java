class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 0) return  0;

        for(int num: nums){
            set.add(num);
        }
        int count=0; int prev = Integer.MIN_VALUE; int longest = 1;

        for(int num:set){

            if(!set.contains(num-1)){
                count = 1;
                prev = num;
            }
            while(set.contains(prev+1)){
                prev = prev +1;
                count++;
            }

            longest = Math.max(count,longest);
        }
        return longest;
    }
}