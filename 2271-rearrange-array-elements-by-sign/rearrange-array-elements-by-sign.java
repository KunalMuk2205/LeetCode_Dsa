class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num: nums){
            if(num > 0) list1.add(num);
            else{
                list2.add(num);
            }
        }

        int i=0; int j=0; int k =0;
        int ans[] = new int[nums.length];

        while(k<nums.length){
            ans[k] = list1.get(i); i++; 
            k++;
            ans[k] = list2.get(j); j++; 
            k++;
        }

        return ans;
    }
}