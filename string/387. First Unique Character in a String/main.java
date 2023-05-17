class Solution {
    public int firstUniqChar(String s) {
        int min = -1;
        int position;
        for(char letter = 'a'; letter <= 'z'; letter++){
            position = s.indexOf(letter);
            if(position == s.lastIndexOf(letter) && position != -1){
                if(min == -1)
                    min = position;
                else
                    min = Math.min(min, position);
            }
        } 
        return min;
    }
}