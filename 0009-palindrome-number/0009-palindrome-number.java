class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0,digit=0,org=x;
        while(x != 0) {
            digit = x%10;
            rev = rev*10+digit;
            x /= 10;
        }
        if(org==rev) return true;
        return false;
    }
}