//A
//A B
//A B C
//A B C D
//A B C D E

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        // char c = 'A';
        for(int j =0; j<=i; j++){
            // System.out.print(c +" ");
            System.out.print((char)('A'+j) +" ");
        // c++;
        }
        System.out.println();
    }
input.close();
}
    }
