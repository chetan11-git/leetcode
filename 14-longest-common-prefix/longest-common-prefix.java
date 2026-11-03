class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int n = 0;
        while( n < s1.length() && n  < s2.length()){
            if(s1.charAt(n)== s2.charAt(n)){
                n++;
            } else {
                break;
            }
        }
        return s1.substring(0, n);
    } 
    
}