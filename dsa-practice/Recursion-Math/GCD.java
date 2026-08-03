import java.util.Scanner;

public class GCD {

    static int hcf(int a, int b){
        int min = a;
        if(b<a){ min =b;}
        for(int i = min ; i>0 ; i--){
            if(a%i ==0 && b%i==0){return i;}
        }
        return 1;}

    static int Eucledianhcf(int a, int b) {
    while (b != 0) {          // keep going until remainder becomes 0
        int r = a % b;         // step: find remainder
        a = b;                 // step: "forget" old a, shift b into a
        b = r;                 // step: new b is the remainder
    }
    return a;                  // when b is 0, a holds the answer
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int gcd = hcf(a, b);
        int Euclediangcd = Eucledianhcf(a, b);
        System.out.println(gcd);
        System.out.println(Euclediangcd);
        int lcm = (a*b)/gcd;
        int Eucledianlcm = (a*b)/Euclediangcd;
        System.out.println(lcm);
        System.out.println(Eucledianlcm);
        sc.close();
}}
