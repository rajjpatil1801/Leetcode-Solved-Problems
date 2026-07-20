class Solution {
    public String rearrangeString(String s, char x, char y) {
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x) cnt++;
        }
        String s1 = "";
        


        for(int i=0;i<s.length();i++){
        
            if(s.charAt(i)==x) continue; 
            else{
                s1 += s.charAt(i);
            }
        }
        while(cnt-->0){
            s1+=x;
        }
      return s1;      
    }
}