//Inverted Right Triangle (star) — decreasing stars per row
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =n; j>i; j--){
            System.out.print("*");
        }
        System.out.println();
    }
input.close();
}
}