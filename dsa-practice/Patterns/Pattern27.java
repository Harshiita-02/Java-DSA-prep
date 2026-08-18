// CheckboardPattern
// * * * * *
//  * * * * 
// * * * * *
//  * * * * 
// * * * * *

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0; i<n; i++){
            for(int j =0; j<2*n-1; j++){
                if((i+j)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
