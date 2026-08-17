//A
//B B
//C C C
//D D D D
//E E E E E

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
        for(int i =0; i<n ; i++){
            
            for(int j = 0; j<=i; j++){
                System.out.print((char)('A'+i)+" ");
                
            }
            System.out.println();
        }
        input.close();
}
}