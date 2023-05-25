class Solution {
    public String longestCommonPrefix(String[] strs) {
        String small = strs[0];
        String large = strs[0];
        for(String str : strs){
            if(small.compareTo(str) > 0)
                small = str;
            else if(large.compareTo(str) < 0)
                large = str;
        }
        for(int i = 0; i < small.length(); i++){
            if(i <= large.length() && small.charAt(i) != large.charAt(i))
                return small.substring(0, i);
        }
        return small;
    }
}