class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int place = 1;
        int key = 0;

        for (int i = 0; i < 4; i++) {
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            int n3 = num3 % 10;

            int min = Math.min(n1, Math.min(n2, n3));
            key += min * place;
            place *= 10;

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return key;
    }
}