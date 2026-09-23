class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rSum  =0;
        int lSum  =0;
        for(int i=0;i<k;i++){
            lSum += cardPoints[i];
        }

        int l =k-1; int n = cardPoints.length;
        int r = n-1;  int maxSum = lSum;

        for(int i=0;i<k;i++){
            lSum -= cardPoints[l];
            rSum += cardPoints[r];
            
            maxSum = Math.max(maxSum,lSum+rSum);

            l--;
            r--;
        }

        
        return maxSum;


    }
}