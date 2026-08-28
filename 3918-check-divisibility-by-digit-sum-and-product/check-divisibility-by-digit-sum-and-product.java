class Solution {
    public boolean checkDivisibility(int n) {
        int originalN = n;
        int add = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            add += digit;
            product *= digit;
            n /= 10;
        }

        int sum = add + product;
        

        if (sum == 0) {
            return false;
        } 
        return originalN % sum == 0; 
    }
}