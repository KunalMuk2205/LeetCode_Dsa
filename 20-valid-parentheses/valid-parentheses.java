import java.util.*;
class Solution {
    public boolean isValid(String s) {
        int n = s.length(); int i=0;
        Stack<Character> st = new Stack<>();
        while(i<n){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch =='['){
                st.push(ch);
            }else{

                if(st.isEmpty()){
                    return false;
                }
                if((st.peek() == '(' && ch==')') || 
                        (st.peek() == '{' && ch=='}')||
                        (st.peek() == '[' && ch==']')){
                            st.pop();
                }else{
                        return false;
                }
            }
            i++;
        }
        return st.isEmpty();
    }
}