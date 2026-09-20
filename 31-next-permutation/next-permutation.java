class Solution {
    public void reverse(int nums[], int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void swap(int nums[], int i, int j){
        int temp =  nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        //find the breaking point
        int brk = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                brk = i;
                break;
            }
        }
        

        // if break is still -1 then we have to jst return the reverse sorted array
        
        if(brk == -1){
            reverse(nums,0,n-1);
            return;
        }


        //find the smallest number that is greater than nums[brk] and swap them

        for(int i=n-1;i>=brk;i--){
            if(nums[i]>nums[brk]){
                swap(nums,i,brk);
                break;
            }
        }
        
        //sort the rest part as it is already sorted just reverse it
        reverse(nums,brk+1,n-1);
    }
}