class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] count = new int[26];
        for(int i = 0; i< s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}
/*
Better solution
As the length is the same. If there is one character that is different, 
one marker will become <0, so do not need to check the marker array again
----------
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] marker = new int[26];

        for (char c : s.toCharArray()) marker[c - 'a']++;
        for (char c : t.toCharArray()) {
            if (marker[c - 'a'] == 0) return false;
            marker[c - 'a']--;
        }

        return true;
    }
}
*/