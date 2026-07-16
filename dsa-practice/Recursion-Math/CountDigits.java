// Math.abs(Integer.MIN_VALUE) actually overflows and returns a negative number — 
// specifically, it returns Integer.MIN_VALUE itself, unchanged! This happens because
//  Java's int range is asymmetric (-2147483648 to 2147483647) — there's no positive 
// counterpart to Integer.MIN_VALUE that fits in an int, so the "absolute value" 
// silently wraps around instead of throwing an error.

// Time: O(log₁₀ n) — since you're dividing by 10 each time, the number of 
// iterations is proportional to the number of digits, which is logarithmic in the
//  value of n it shows you understand why it's logarithmic, not just pattern-matching
//  to "loops = O(n)."
// Space: O(1)

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        n = Math.abs(n);          // handle negative numbers--> gives absolute values
        int count = (n == 0) ? 1 : 0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count + " is the no. of digits");

        sc.close();

    }
}
