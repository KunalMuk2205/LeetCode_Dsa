class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0) return 0;
        
        HashMap<Character,Integer> map = new HashMap<>();

        int  maxLen = Integer.MIN_VALUE;
        int l=0, r=0;

       while(r<s.length()){

        if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
            l = map.get(s.charAt(r)) +1;
            map.put(s.charAt(r),r);
        }

        map.put(s.charAt(r),r);

        int len = r-l+1;
        maxLen = Math.max(len,maxLen);

        r++;
       }

       return maxLen;
    }
}