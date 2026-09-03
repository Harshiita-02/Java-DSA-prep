//      *
//     ***
//    *****
//   *******
//  *********
//   *******
//    *****
//     ***
//      *

import java.util.Scanner;
public class Pattern9 {
    static void printDiamond(int n) {
    // top half (pyramid)
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-i-1; j++) System.out.print(" ");
        for (int j = 0; j < 2*i+1; j++) System.out.print("*");
        System.out.println();
    }
    // bottom half (inverted pyramid)
    for (int i = n-2; i >= 0; i--) {
        for (int j = 0; j < n-i-1; j++) System.out.print(" ");
        for (int j = 0; j < 2*i+1; j++) System.out.print("*");
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printDiamond(n);
input.close();}}
