//1             1
//1 2         2 1
//1 2 3     3 2 1
//1 2 3 4 4 3 2 1

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<=i; j++){
           System.out.print(j+1);}
        for(int k =0; k<2*(n-i-1); k++){
           System.out.print(" ");}
        for(int l =i; l>=0; l--){
           System.out.print(l+1);}
                System.out.println();
    }input.close();
}}
