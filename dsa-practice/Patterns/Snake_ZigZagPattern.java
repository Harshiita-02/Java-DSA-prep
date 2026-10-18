public class Snake_ZigZagPattern {

    public static void main(String[] args) {
        int n= 5;
        for(int i =0; i<n; i++){
            if(i%2==0){
                for(int j = 0; j<n;j++){ System.out.print(i*n + j +1 + " ");}
                }
            else{
                for(int j = n-1; j>=0;j--){System.out.print(i*n + j +1  + " ");}
            }
            System.out.println();
        }
    }
}