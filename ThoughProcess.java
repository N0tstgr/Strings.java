class Solution {
    public  static int reverseDegree(String s) {
        int val = 0;
        for(int i = 0; i<s.length(); i++){
            val = val + ('z' - s.charAt(i) + 1)*(i+1) ;
        }
        return val;
    }
}
