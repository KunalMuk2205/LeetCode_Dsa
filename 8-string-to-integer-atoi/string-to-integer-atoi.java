class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        long result = solve(i, s, n, 0, sign);

        if (result == Long.MAX_VALUE) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return (int)(result * sign);
    }

    public long solve(int i, String s, int n, long result, int sign) {

        if (i >= n) return result;

        if (!Character.isDigit(s.charAt(i))) {
            return result;
        }

        int digit = s.charAt(i) - '0';

        long limit = sign == 1 ? Integer.MAX_VALUE : 2147483648L;

        if (result > limit / 10 ||
            (result == limit / 10 && digit > limit % 10)) {
            return Long.MAX_VALUE;
        }

        result = result * 10 + digit;

        return solve(i + 1, s, n, result, sign);
    }
}