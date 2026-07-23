class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            hs.add(jewels.charAt(i));
        }
        int cnt = 0;
        for(char ch : stones.toCharArray()){
            if(hs.contains(ch)) cnt++;
        }
        return cnt;
    }
}