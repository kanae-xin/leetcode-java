public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int top = n;
        int bot = 1;
        int med;
        while(true){
            med = bot + (top-bot)/2;   // top+bot might higher than int limit
            if(top-bot <= 1){
                if(isBadVersion(bot)==false){
                    return top;
                }
                else{
                    return bot;
                }
            }
            else if(isBadVersion(med)==true)
                top = med;
            else
                bot = med;
        }
    }
}