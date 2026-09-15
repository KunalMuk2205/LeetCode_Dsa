class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        List<Character> list = new ArrayList(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));

        for(char c : list){
            for(int i=0; i<map.get(c); i++){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}