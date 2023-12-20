class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = word1.length() + word2.length();
        String s = "";
        for(int i = 0; i< length; i++){
            if(i < word1.length()){
                s+= word1.charAt(i);
            }
            if(i < word2.length()){
                s+= word2.charAt(i);
            }
        }
        return s;
    }
}