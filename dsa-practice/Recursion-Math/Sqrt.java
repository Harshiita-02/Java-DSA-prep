import java.util.Scanner;

public class Sqrt {

    static int sqrtBinarySearch(int n){
        if(n<2){return n;}
        int start=1; int end =n ; int ans =1;
        while(start<=end){
        int mid = start + (end-start)/2;
        if((long)mid*mid<=n){
            ans =mid;
            start=mid+1;
        }
        else{end=mid-1;}}
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sqrt : "+sqrtBinarySearch(n));
   sc.close(); }
}
