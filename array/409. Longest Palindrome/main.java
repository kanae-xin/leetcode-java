class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> count = new HashSet<Character>();
        int res = 0;
        for(int i=0; i< s.length();i++){
            if(count.contains(s.charAt(i))){
                count.remove(s.charAt(i));
                res += 2;
            }
            else
                count.add(s.charAt(i));
        }
        if(!count.isEmpty()){
            res++;
        }
        return res;
    }
}