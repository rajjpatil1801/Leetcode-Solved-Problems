class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int left=0,maxi=0;
       for(int right=0;right<s.length();right++){
        char curr = s.charAt(right);
        while(set.contains(curr)) set.remove(s.charAt(left++));
        set.add(curr);
        maxi = Math.max(right-left+1,maxi);

       }
       return maxi;
    }
}