class reversed {
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int r = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && r > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && r < -8)) return 0;

            ans = ans * 10 + r;
            x /= 10;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(reverse(123));

    }
}

