class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int l=0;l<nums.length;l++){
            if(nums[l] > 0) list1.add(nums[l]);
            else{
                list2.add(nums[l]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<list1.size() && j<list2.size()){
            ans.add(list1.get(i));
            ans.add(list2.get(j));
            i++;
            j++;
        }

        int answer[] = new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            answer[k] = ans.get(k);
        }
        return answer;
    }
}