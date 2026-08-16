// Solid Rectangle — n×n block of stars
// *****
// *****
// *****
// *****
// *****
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
    for(int i =0; i<n; i++){
        for(int j =0; j<n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
input.close();}}
