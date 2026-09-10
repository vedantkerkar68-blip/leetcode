class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        if (n == 1) return k == 0 ? 1 : 0;
        
        int equal = 0;
        for (int i = 1; i < s.length(); i++) 
            if (s.charAt(i) == s.charAt(i - 1)) equal++;
        
        int b = s.charAt(0) == s.charAt(n - 1) ? 1 : 0;

        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = 0;
            if (i == 0) {
                a = equal;
            } else {
                int r = s.charAt(i - 1) == s.charAt(i) ? 1 : 0;
                a = equal - r + b;
            }
            if (a == k) total++;
        }
        return total;
    }
}