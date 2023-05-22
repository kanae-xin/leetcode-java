class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        if(old == color)
            return image;
        help(image, sr, sc, old, color);
        return image;
    }

    public void help(int[][] image, int sr, int sc, int old, int newValue){
        image[sr][sc] = newValue;
        if(sr >= 1 && image[sr-1][sc] == old)
            help(image, sr-1, sc, old, newValue);
        if(sc >= 1 && image[sr][sc-1] == old)
            help(image, sr, sc-1, old, newValue);
        if(sr < image.length-1 && image[sr+1][sc] == old)
            help(image, sr+1, sc, old, newValue);
        if(sc < image[0].length-1 && image[sr][sc+1] == old)
            help(image, sr, sc+1, old, newValue);
    }   
}