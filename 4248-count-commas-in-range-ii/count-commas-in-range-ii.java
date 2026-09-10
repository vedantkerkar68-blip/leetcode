class Solution {
    public long countCommas(long n) {
        if (n < 1000) return 0;

        long c = 0;
        long a = 1000;

         while (a <= n) {
            c += n - a + 1;
            a *= 1000;
        }
        return c;
    }
}