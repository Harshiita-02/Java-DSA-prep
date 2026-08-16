//Right Triangle (star) — increasing stars per row, left-aligned
// *
// **
// ***
// ****
// ***** 

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
input.close();
    }
}
