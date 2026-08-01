public class Alphabets {
    public static void main(String[] args) {
        int n =5;
        for(int i =0; i<n; i++){
            // for(int j =0; j<=i; j++){
                // System.out.print((char)('A'+i));
                // System.out.print((char)('A'+j));}

                for(int j = 0; j<n-i; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();}
    }
}
