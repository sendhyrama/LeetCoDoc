class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalNumber = x;
        int reversedNumber = 0;

        while (x > 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }
        return originalNumber == reversedNumber;
    }
    public static void main (String[] args) {
        int x1 = 121;
        System.out.println(isPalindrome(x1));

        int x2 = 121;
        System.out.println(isPalindrome(x2));

        int x3 = 10;
        System.out.println(isPalindrome(x3));
    }
}