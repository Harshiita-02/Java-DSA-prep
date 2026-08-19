public class DecimalToBinary {
    static int deci2binary(int n){
        int binary = 0;
        int place = 1;
        while(n>0){
            int rem= n%2;
            n = n/2;
            binary = binary + rem * place;
            place = place * 10;
        }
        return binary;
    }

    static int binary2deci(int n){
        int decimal = 0;
        int place = 1;
        while(n>0){
            int rem= n%10;
            n = n/10;
            decimal = decimal + rem * place;
            place = place * 2;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int n = 10;
        int B = 101011;
        System.out.println(deci2binary(n));
        System.out.println(binary2deci(B));}
    }

