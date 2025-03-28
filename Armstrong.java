public class Armstrong {
    public static boolean armstrong(int n) {
        int temp = n;
        int count = 0;
        int ans = 0;
        
        // Count number of digits
        int num = n; // Store original number for counting digits
        while (num != 0) {
            num = num / 10;
            count++;
        }
        
        // Calculate Armstrong sum
        num = n; // Reset num to original value
        while (num != 0) {
            int r = num % 10;
            ans += (int) Math.pow(r, count);
            num /= 10;
        }
        
        return ans == temp;
    }

    public static void main(String[] args) {
        System.out.println(armstrong(153)); // true
        System.out.println(armstrong(9474)); // true
        System.out.println(armstrong(9475)); // false
    }
}
