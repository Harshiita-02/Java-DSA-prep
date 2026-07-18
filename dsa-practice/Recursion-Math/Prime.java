// Time: O(√n) — correctly optimized already, this is the right complexity to state
// Space: O(1)

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n < 2) {
        isPrime = false;   // 0, 1, and negatives are never prime
        }
        else{
        for(int i =2 ;i*i<=n; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }}
        if(isPrime){
            System.out.println(n+" is a prime number");}
        else{
            System.out.println(n+" is NOT a prime number");
        }
    sc.close();}
    
}
