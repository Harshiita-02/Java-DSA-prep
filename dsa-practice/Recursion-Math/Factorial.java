import java.util.Scanner;
// Time Complexity: both O(n).
// Space Complexity: iterative O(1); recursive O(n) due to call stack — same reasoning as your palindrome recursion earlier.
public class Factorial {

    static long recursiveFactorial(int n){
    if(n<2){
        return 1;
    }
    return n*recursiveFactorial(n-1);
}

static long iterativeFactorial(int n){
    long fact=1;
    for(int i=n; i>1; i--){
        fact *=i;
    }
    return fact;
}    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        System.out.println(iterativeFactorial(n));
        System.out.println(recursiveFactorial(n));
    sc.close();}
    
}
