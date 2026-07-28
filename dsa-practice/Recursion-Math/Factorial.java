import java.util.Scanner;
// Time Complexity: both O(n).
// Space Complexity: iterative O(1); recursive O(n) due to call stack
// Q: "At what point does long overflow for factorial?"
// A: Around 21! — 20! fits in a long, 21! overflows. Good to know the actual number if
//  pushed, but the key point is knowing overflow is possible at all and picking the 
//  largest reasonable primitive type.

// Q: "Which would you use in production — iterative or recursive?"
// A: Iterative — O(1) space vs O(n) stack space, and no risk of StackOverflowError for 
// large n. Recursive is cleaner to read but recursion depth is a real practical risk 
// here (large n could crash the recursive version before it crashes the iterative one).
public class Factorial {

    static long recursiveFactorial(int n){
    if (n < 0) {throw new IllegalArgumentException("Factorial not defined for negative numbers");}
    if(n==0 || n==1){return 1;}
    return n*recursiveFactorial(n-1);}

static long iterativeFactorial(int n){
    if (n < 0) {
    throw new IllegalArgumentException("Factorial not defined for negative numbers");}
    long fact=1;
    for(int i=n; i>1; i--){
        fact *=i;}
    return fact;}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        
        System.out.println(iterativeFactorial(n));
        System.out.println(recursiveFactorial(n));
    sc.close();}
    
}
