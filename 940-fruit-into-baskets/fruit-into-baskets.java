class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int l=0, r=0; int n = fruits.length; int maxLen = Integer.MIN_VALUE;

        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0) map.remove(fruits[l]);
                l++;
            }

            if(map.size()<=2){
                int len = r-l+1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
        }
        return maxLen;
    }
}