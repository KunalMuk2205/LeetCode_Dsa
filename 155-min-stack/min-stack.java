class MinStack {
    Stack<Long> st = new Stack<>();
    long min = Long.MAX_VALUE;
    
    public MinStack() {
    }
    
    public void push(int val) {
        long v = (long) val;
        if (st.isEmpty()) {
            min = v;
            st.push(v);
        } else {
            if (v >= min) {
                st.push(v);
            } else {
                st.push(2 * v - min);
                min = v;
            }
        }
    }
    
    public void pop() {
        long n = st.peek();
        st.pop();
        if (n < min) {
            min = 2 * min - n;
        }
    }
    
    public int top() {
        if (st.isEmpty()) return -1;
        long n = st.peek();
        if (min < n) return (int) n;
        return (int) min;
    }
    
    public int getMin() {
        return (int) min;
    }
}