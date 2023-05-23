class Solution {
    public int searchInsert(int[] nums, int target) {
        int large = nums.length - 1;
        int small = 0;
        if(target < nums[0])
            return 0;
        else if(target > nums[large])
            return large + 1;
        int med = large/2;
        while(large - small > 1){
            if(nums[med] == target)
                return med;
            if(nums[med] > target)
                large = med;
            else
                small = med;
            med = (large + small) / 2; 
        }
        if(nums[small] == target)
            return small;
        else
            return large;
    }   
}