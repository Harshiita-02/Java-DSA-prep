//Reversed Number Pyramid
// 5
// 4 5
// 3 4 5
// 2 3 4 5
// 1 2 3 4 5

import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i =0; i<n;i++){
        for(int j =n-i; j<=n; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }

    input.close();
    }
}
