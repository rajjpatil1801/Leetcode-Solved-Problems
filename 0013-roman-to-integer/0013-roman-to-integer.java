class Solution {
    public int value(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;

    }

    public int romanToInt(String s) {
        int num = 0;
        int n = s.length();
        for (int i = 0; i <= n - 1; i++) {
            int val1 = value(s.charAt(i));
            if (i == n - 1) {
                num += val1;
                continue;
            }
            int val2 = value(s.charAt(i + 1));
            if (val2 > val1) {
                num += val2 - val1;
                i++;
            }
            if (val1 >= val2)
                num += val1;
            
        }
        return num;
    }
}