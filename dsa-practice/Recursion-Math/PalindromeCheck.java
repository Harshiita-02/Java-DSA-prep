import java.util.Scanner;
// Time Complexity: O(d) — d = number of digits, same as your reverse() function.
// Space Complexity: O(1).
public class PalindromeCheck {
    static int reverse(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);
        int rev = 0;
        while (n > 0) {
          int digit = n % 10;
         if (rev > (Integer.MAX_VALUE - digit) / 10) {
            throw new ArithmeticException("Reversed number overflows int range");
        }
        rev = rev * 10 + digit;
        n /= 10;}
        return isNegative ? -rev : rev;
    
}    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        reverse(n);
        if(original == reverse(n)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    sc.close();}
}
