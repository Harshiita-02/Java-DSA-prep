import java.util.Scanner;
// Time Complexity:
// Iterative: O(n)
// Recursive: O(2^n) — this is the important one to know. Each call branches into two more calls, so the number of calls roughly doubles with each increase in n. Try n=40 with your recursive version and you'll feel it — it'll be visibly slow.

// Space Complexity:
// Iterative: O(1)
// Recursive: O(n) — max depth of the call stack.
public class Fibonacci {
    static int recursiveFibonacci(int n){
        if(n==0 || n==1){
            return n;}
return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);}

static long iterativeFibonacci(int n){
    if(n == 0) return 0;
    long a = 0;
    long b = 1;
    for (int i = 0; i < n-1; i++) {
        long c = a + b;
        a = b;
        b = c;
    }
    return b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        

        System.out.println(recursiveFibonacci(n));
        System.out.println(iterativeFibonacci(n));
    sc.close();}
    
}
