class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int l = s.length();
        int sum = 0;
        if(l>=1 && l<=15){
            for(int i=0; i<l; i++){
                int current = m.get(s.charAt(i));

                if((i+1 < l ) && (m.get(s.charAt(i+1)) > current)){
                    sum -= current;
                }
                else{
                    sum += current;
                }
            }
        }
        return sum;
    }
}