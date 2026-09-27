class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> st = new Stack<>();
        st.push(new StringBuilder());
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(new StringBuilder());
            }
            else if(c == ')'){
                StringBuilder current = st.pop();
                current.reverse();
                st.peek().append(current);
            }
            else{
                st.peek().append(c);
            }
        }
        return st.peek().toString();
    }
}