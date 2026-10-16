

/**
 * L9
 */
public class L9 {
    public static boolean isPalindrome(int x) {
         if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;

        while (x > reverse) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return x == reverse || x == reverse / 10;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
    }
    
}