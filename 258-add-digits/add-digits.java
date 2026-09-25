public class Solution
{
    public int addDigits(int num)
    {
        if (num == 0)
            return 0;

        int digitRoot = num % 9;
        return digitRoot == 0 ? 9 : digitRoot;
    }
}