class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for(int i=0; i<nums1.length;i++){
            if(map1.containsKey(nums1[i]))
                map1.put(nums1[i], map1.get(nums1[i])+1);
            else
                map1.put(nums1[i], 1);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums2.length;i++){
            if(map1.containsKey(nums2[i]) && map1.get(nums2[i])>0){
                list.add(nums2[i]);
                map1.put(nums2[i], map1.get(nums2[i]) - 1);
            }
        }
        int length = list.size();
        int j = 0;
        int[] res = new int[length];
        for(int i : list){
            res[j] = i;
            j++; 
        }
        return res;
    }
    // 
    // 排序2个数组
    // 双指针
    // 上下指针移动,相等时一起移动,并且输出.不相等时小的移动,直到数组尾巴
    // 
}