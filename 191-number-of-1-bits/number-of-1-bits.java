class Solution {
    public int hammingWeight(int n) {
        int mask = 1; int count = 0;

        while(mask>0){
            int ans = n & mask;
            if(ans != 0 ) count++;
            mask = mask << 1;
        }
        return count;
    }
}