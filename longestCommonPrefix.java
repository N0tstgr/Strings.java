class Solution {
    public  static String longestCommonPrefix(String[] strs) {
        String b = "";
        for(int j = 0; j<strs[0].length(); j++){
            char a = strs[0].charAt(j);
            boolean match = true;
            for(int i = 1; i<strs.length; i++){
                if(j>=strs[i].length() || a!=strs[i].charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                b = b+ a;
            }else{
                break;
            }

        }
return b;
    }
}
