class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            if(magazine.indexOf(ransomNote.charAt(i)) >= 0){
                magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)), "");
            }
            else
                return false;
        }
        return true;
    }
}
/*
better solution
---------
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}
*/