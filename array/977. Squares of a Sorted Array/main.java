class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int index = nums.length- 1;
        int result[] = new int [nums.length];
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[index] = nums[left] * nums[left];
                left++;
            }
            else{
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }

 /* 算法也是O(n),节约空间

    public int[] sortedSquares(int[] nums) {
        Stack<Integer> minus = new Stack<Integer>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0)
                minus.push(nums[i]*nums[i]);
            else{
                while(!minus.isEmpty() && minus.peek() < nums[i] * nums[i]){
                    nums[j++] = minus.pop();
                }
                nums[j++] = nums[i] * nums[i];
            }
        }
        while(!minus.isEmpty()){
            nums[j++] = minus.pop();
        }
        return nums;
    }
    */
}