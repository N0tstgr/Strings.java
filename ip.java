class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder(address);
        int i  = 0;
        while(i<ans.length()){
            if(ans.charAt(i) == '.'){
                ans.deleteCharAt(i);
                ans.insert(i,"[.]");
                 i = i+3;
            }else{
                i++;
            }
        }
        return ans.toString();
    }
}
