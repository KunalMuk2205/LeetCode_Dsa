class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxLen = Integer.MIN_VALUE; int maxFreq = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            while((r-l+1)-maxFreq > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }

            maxLen = Math.max(r-l+1,maxLen);
            r++;
        }

        return maxLen;
    }
}