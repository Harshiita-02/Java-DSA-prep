// Time Complexity: O(d) — where d is the number of digits in n.
// Space Complexity: O(1) — just a few integer variables.
    import java.util.Scanner;

public class Reverse {
   static int reverse(int n) {
    boolean isNegative = n < 0;
    n = Math.abs(n);
    int rev = 0;
    while (n > 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }
    return isNegative ? -rev : rev;
}
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    sc.close();}
}
