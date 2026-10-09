class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int answer = 0,  closeCount = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                if(closeCount == 1){
                    answer ++;
                    if(!(st.isEmpty())){
                        st.pop();
                    }
                    else answer ++;
                    closeCount = 0;
                }
                st.push(c);
            }
            else {
               closeCount ++;
               if(closeCount == 2){

                if(!(st.isEmpty())){
                    st.pop();
                }else answer ++;

                closeCount = 0;
               }

            }
        }
        // handle the left over ')'
        if(closeCount == 1){
            answer ++;
            if(!st.isEmpty()){
                st.pop();
            }
            else answer ++;
        }

        answer = answer + (st.size() * 2);
        return answer;
    }
}