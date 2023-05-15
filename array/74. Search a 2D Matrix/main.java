class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length;
        int height = matrix[0].length;
        int size = length * height;
        int small = 0;
        int large = size-1;
        int med = 0;
        while(large - small > 1){
            med = (small + large) / 2;
            if(matrix[med/height][med%height] == target){
                return true;
            }
            else if(matrix[med/height][med%height] > target)
                large = med;
            else
                small = med;
        }
        return (matrix[small/height][small%height] == target || matrix[large/height][large%height] == target) ? true : false;
    }
}