//E
//D E
//C D E
//B C D E
//A B C D E

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = input.nextInt();
        for(int i =0; i<n ; i++){
            // char c = 'A';
            for(int j = n-i-1; j<n; j++){
                System.out.print((char)('A'+j)+" ");
                
                // System.out.print(c+" ");
                // c+=i;
                
            }
            System.out.println();
        }
        input.close();
}
}