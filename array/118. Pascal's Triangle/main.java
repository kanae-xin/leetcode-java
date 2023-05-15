class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> cur = new ArrayList<Integer>();
            if(i==0){
                cur.add(1);
                res.add(cur);
                continue;
            }
            for(int j=0;j<=i;j++){
                if(j==i){
                    cur.add(1);
                    res.add(cur);
                }
                else if(j==0)
                    cur.add(1);
                else{
                    cur.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
        }
        return res;
    }
}