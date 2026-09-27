class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        int l=0, r=0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        while(r<n){
            char ch = s.charAt(r);

            if(map.containsKey(ch) && map.get(ch)>0) count++;

    
                map.put(ch, map.getOrDefault(ch,0)-1);
            

            while(count == m){
                if(r-l+1 < minLen){
                    minLen = Math.min(minLen,r-l+1);
                    sIndex = l;
                }

                if(map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l),map.get(s.charAt(l))+1);

                    if(map.get(s.charAt(l))>0){
                        count --;
                    }
                }

                l++;
            }

            r++;

        }

        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);















        // int n = s.length(); int m = t.length(); int minLen = Integer.MAX_VALUE;
        // int sIndex = -1;

        // for(int i=0;i<n;i++){
        //     HashMap<Character,Integer> map = new HashMap<>();
        //     int count = 0;

        //     for(int j=0;j<m;j++){
        //         map.put(t.charAt(j),map.getOrDefault(t.charAt(j),0)+1);
        //     }

        //     for(int k=i;k<n;k++){
        //         if(map.containsKey(s.charAt(k)) && map.get(s.charAt(k))>0) count ++;

        //         if(map.containsKey(s.charAt(k))){
        //             map.put(s.charAt(k),map.get(s.charAt(k))-1);
        //         }
                
        //         if(count == m){
        //             if(k-i+1 < minLen){
        //                 minLen = Math.min(minLen, k-i+1);
        //                 sIndex = i;
        //             }
        //             break;
        //         }
        //     }
        // }
        // return sIndex == -1 ? "":s.substring(sIndex, sIndex + minLen);


    }
}