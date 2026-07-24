class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> m1 = new HashMap<>();
       HashMap<Character,Integer> m2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int freq = m1.getOrDefault(c,0);
            m1.put(c,freq+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            int freq = m2.getOrDefault(c,0);
            m2.put(c,freq+1);
        }
        return m1.equals(m2);
    }
}