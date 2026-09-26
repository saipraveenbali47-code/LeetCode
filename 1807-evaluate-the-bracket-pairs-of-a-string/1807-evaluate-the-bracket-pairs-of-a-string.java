class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < knowledge.size(); i ++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        int i = 0;
        String result = "";
        while(i < s.length()){
            if(s.charAt(i) != '('){
                result += s.charAt(i);
                i ++;
            }
            else{
                i ++;
                String key = "";
                while(s.charAt(i) != ')'){
                    key += s.charAt(i);
                    i ++;
                }
                i++;
                if(map.containsKey(key))result += map.get(key);
                else result += "?";
            }
        }
        return result;
    }
}