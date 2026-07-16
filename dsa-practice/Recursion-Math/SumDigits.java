// Time: O(log₁₀ n) — same reasoning as Count Digits, proportional to the number of digits
// Space: O(1)
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        n=Math.abs(n);
        int sum =0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum+=rem;
        }
        System.out.println(sum + " is the sum of all digits");

        sc.close();

    }
}
