class Solution {
    public boolean isSubsequence(String s, String t) {
        int sc=0;
        int mc=0;
        while(sc<s.length() && mc<t.length()){
            if(s.charAt(sc) == t.charAt(mc)){
                sc++;
            }
            mc++;
        }

        return sc==s.length();
    }
}