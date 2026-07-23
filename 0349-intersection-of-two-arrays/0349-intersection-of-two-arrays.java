class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        
        for(int x:nums1) hs.add(x);
        for(int x:nums2){
            if(hs.contains(x)==true) hs1.add(x);
        }
        int arr [] = new int[hs1.size()];
        int i=0;
        for(int x:hs1){
            arr[i] = x;
            i++; 
        }
        return arr;
    }
}