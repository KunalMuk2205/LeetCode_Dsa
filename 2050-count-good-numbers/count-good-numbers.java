class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (long)((power(5,even) * power(4,odd)) % MOD);

        return (int) ans;
    }
    public long power(long n, long i){
         if (i == 0)
            return 1;

        long half = power(n, i / 2);

        long ans = (half * half) % MOD;

        if (i % 2 == 1)
            ans = (ans * n) % MOD;

        return ans;
    }
}