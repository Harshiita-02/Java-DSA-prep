//Right Triangle (repeated row number) — 1, 22, 333...
// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<=i; j++){
            System.out.print(i+1);
        }
        System.out.println();
    }
input.close();
}}
