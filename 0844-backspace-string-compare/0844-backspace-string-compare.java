class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#') {if(!st.isEmpty())st.pop();}
            else st.push(c);
        }
        StringBuilder  s1 = new StringBuilder();
        while(!st.isEmpty()){
            s1.append(st.pop());
        }
        s1.reverse();
        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!st.isEmpty())st.pop();
            }
            else{st.push(c);}
        }
        StringBuilder  t1 = new StringBuilder();
        while(!st.isEmpty()){
            t1.append(st.pop());
        }
        t1.reverse();
        return (s1.toString()).equals(t1.toString());
    }
}