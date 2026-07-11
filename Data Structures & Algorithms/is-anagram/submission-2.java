class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] anag = new int[128];
        for(char c : s.toCharArray()){
            anag[c]++;
        }
        for(char c : t.toCharArray()){
            anag[c]--;
        }
        for(int i : anag){
            if(i>0) return false;
        }
        return true;
    }
}
