//A B C D E
//A B C D
//A B C
//A B
//A

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
        for(int i =0; i<n ; i++){
            char c = 'A';
            for(int j = 0; j<n-i; j++){
                // System.out.print((char)('A'+j)+" ");
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        input.close();
    }
}
