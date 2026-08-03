import java.util.Scanner;
// Time complexity: O(d) where d = number of digits in n (effectively O(log n)).
// Space complexity: O(1) (ignoring the tiny String conversion for digit count, which is O(d) space but negligible).
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int original = n;

        int digits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }

        System.out.println(sum == original ? "Armstrong Number" : "NOT an Armstrong Number");
        sc.close();
    }
}