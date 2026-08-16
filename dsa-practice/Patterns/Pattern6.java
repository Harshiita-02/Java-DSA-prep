// Inverted Right Triangle (numbers) — 12345, 1234, 123...
// 12345
// 1234
// 123
// 12
// 1

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<n-i; j++){
            System.out.print(j+1);
        }
        System.out.println();
    }
input.close();
}
}