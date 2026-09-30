class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        for (int i = 0; i < items.size(); i++) {

            int index = 0;

            if (ruleKey.equals("type")) {
                index = 0;
            } else if (ruleKey.equals("color")) {
                index = 1;
            } else if (ruleKey.equals("name")) {
                index = 2;
            }

            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
