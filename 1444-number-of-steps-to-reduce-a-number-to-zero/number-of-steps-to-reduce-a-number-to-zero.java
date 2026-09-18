class Solution {
    public int numberOfSteps(int num) {
        int ans = solve(0,num);
        return ans;
    }

    public int solve(int cnt,int num){

        if(num == 0) return cnt;

        if(num %2 == 0){
            num = num/2;
            cnt++;
        }else{
            num = num-1;
            cnt++;
        }

        return solve(cnt,num);
    }
}