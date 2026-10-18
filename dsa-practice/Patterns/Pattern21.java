// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
public class Pattern21 {
    public static void main(String[] args) {
        int n =4;
        for(int i =0; i<2*n-1; i++){
            for(int j =0; j<2*n-1; j++){
                if(i==n-i || j==n-j){
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
    }
}
