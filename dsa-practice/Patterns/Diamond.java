import java.util.Scanner;

public class Diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<2*n-1 ; i++){

            if(i<n){
            for(int j =0; j<n-i-1; j++){System.out.print("  ");}
            for(int k =0; k<2*i+1; k++){System.out.print("* ");}}

            else{
            for(int j =0; j<=i-n; j++){System.out.print("  ");}
            for(int k = 2*(i+1)-n-4*(i-n) ; k>0;k--){System.out.print("* ");}
            }
            System.out.println();}

        sc.close();
    }
}
