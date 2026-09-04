import java.util.Arrays;

public class DiagonalTraverse {

    static int [] diagonalTraversal(int [][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int []result = new int[rows * cols];
        int i =0;
        for(int d=0; d < rows+cols; d++){
            if(d%2==0){
                int r = Math.min(rows-1, d);
                int c = d-r;
                while(r>=0 && c<cols){
                    result[i++]=arr[r][c];
                    r--;
                    c++;
                }}
            else{
                int c = Math.min(cols-1, d);
                int r = d-c;
                while(c>=0 && r<rows){
                    result[i++]=arr[r][c];
                    r++;
                    c--;
            }
            }
        }
        return result;
    }
    public static void main(String[] args) {
    int [][] arr = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
    System.out.println(Arrays.toString(diagonalTraversal(arr)));

    }
}
