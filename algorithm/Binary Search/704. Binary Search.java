class Solution {
    public int search(int[] nums, int target) {
        int top = nums.length - 1;
        int bot = 0;
        int med = 0;
        while(true){
            med = (top + bot)/2;
            if(top-bot <= 1){
                if(target == nums[top]){
                    return top;
                }
                else if(target == nums[bot]){
                    return bot;
                }
                else
                    return -1;
            }
            else if(nums[med] > target)
                top = med;
            else if(nums[med] < target)
                bot = med;
            else
                return med;
        }
    }
}