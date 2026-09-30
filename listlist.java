class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        for(int i = 0; i<items.length; i++){
            for(int j = 0; j<items[i].length; j++){
                if(items.get(i).get(j).equals(ruleKey) && items.get(i).get(j).equals(ruleValue)){
                    items.add(i);
                }
            }
        }
        return item;
    }
}
