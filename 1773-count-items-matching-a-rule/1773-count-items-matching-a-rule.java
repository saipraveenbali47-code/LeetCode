class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int keyIndex;
        if(ruleKey.equals("type")){
            keyIndex = 0;
        }
        else if(ruleKey.equals("color")){
            keyIndex = 1;
        }
        else keyIndex = 2;
        int ans = 0;
        for(List<String> item : items){
            if(item.get(keyIndex).equals(ruleValue))ans ++;
        }
        return ans;
    }
}