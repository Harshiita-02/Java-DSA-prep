//       A
//     A B A
//   A B C B A
// A B C D C B A

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
        for(int i =0; i<n ; i++){
            for(int j =0; j<n-i-1;j++){
                System.out.print("  ");}
            for(int k = 0; k<=i; k++){
                System.out.print((char)('A'+k)+" ");}
            for(int l =i; l>0; l--){
                System.out.print((char)('A'+l-1)+ " ");}
            System.out.println();
        }
        input.close();
}}
