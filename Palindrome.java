class Palindrome {
    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int dup = x; // Store original number
        int ans = 0;
        
        while (x != 0) {
            int r = x % 10;

            // Check for overflow before updating ans
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && r > 7)) {
                return false;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && r < -8)) {
                return false;
            }

            ans = ans * 10 + r;
            x /= 10;
        }

        return ans == dup; // Check if reversed number matches the original
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}

