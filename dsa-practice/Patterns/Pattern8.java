//Inverted Pyramid (star) — centered, spaces + decreasing stars
//   *********
//    *******
//     *****
//      ***
//       *
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<i; j++){
            System.out.print(" ");}

        for(int j =2*(n-i)-1; j>0; j--){
            System.out.print("*");}
        System.out.println();
    }
input.close();
}
}
