class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()) return false;

        int i=0; 
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(1,s.length()));
        sb.append(s.charAt(0));

        while(i<s.length()){

            if(sb.toString().equals(goal)) return true;

            StringBuilder temp = new StringBuilder();
            
            char ch = sb.charAt(0);
            temp.append(sb.substring(1,s.length()));
            temp.append(ch);
            sb = temp;

            i++;
        }

        return false;
    }
}