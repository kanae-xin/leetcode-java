class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int size = mat.length * mat[0].length;
        if(r>size || size%r!=0)
            return mat;
        c = size / r;
        int[][] res = new int[r][c];
        int x = 0;
        int y = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(y==n){
                    y = 0;
                    x++;
                }
                res[i][j] = mat[x][y++];
            }
        }
        return res;
    }
    // 原思路,转为1维再转成所问
    // 优化: 在同一个循环中,通过判断是否达到c,来自行循环.因为两者同时结束
}