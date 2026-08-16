//Right Triangle (star) — increasing stars per row, left-aligned
// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<=i; j++){
            System.out.print(j+1);
        }
        System.out.println();
    }
input.close();}
}
