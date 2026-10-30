class Solution {
    public String longestPalindrome(String s) {

        if(s.length()<=1){
            return s;
        }
        String maxStr = s.substring(0,1);
        int n = s.length();
      

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int left=i;
                int right = j;
                boolean isPalindrome = true;

                while(left<right){
                    if(s.charAt(left) != s.charAt(right)){
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(isPalindrome && (j-i+1)>maxStr.length()){
                    maxStr = s.substring(i,j+1);
                }
            }
        }   
        return maxStr;
    }
}