//Diamond binary pattern (1/0 alternating by parity)
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<=i; j++){
            if((i+j)%2==0){System.out.print("1 ");}
            else{
            System.out.print("0 ");}}

        System.out.println();
    }
input.close();
}
}
