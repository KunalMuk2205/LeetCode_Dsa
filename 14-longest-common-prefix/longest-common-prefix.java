class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans = "";
        Arrays.sort(strs);
        if(strs[0].equals("")) return ans;

        int n = strs.length;

        String first = strs[0];
        String last = strs[n-1];

        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        for(int j=0;j<i;j++){
            ans+=first.charAt(j);
        }

        return ans;
    }
}