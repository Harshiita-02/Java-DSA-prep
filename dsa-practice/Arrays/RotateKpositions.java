import java.util.Arrays;
import java.util.Scanner;

public class RotateKpositions {
    static void reverse(int []arr, int start, int end){
        while(start<=end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;}}

    static int[] optimalSolution(int []arr, int k){
         if(k>=0){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);}
        else{
           k= Math.abs(k);
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);}
        return arr;}

    static void bruteForce(int []arr, int k){
        int n = arr.length;
        int []temp = new int[n];
        for(int i =0; i<k; i++){
            temp[i]=arr[i];}
        for(int i =k; i<n; i++){
            arr[i-k]=arr[i];}
        for(int i =0; i<k; i++){
            arr[n-k+i]=temp[i];}
        }
    
    public static void main(String[] args) {
        int[]arr = {4,6,5,3,2,1};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k%=arr.length;

        System.out.println(Arrays.toString(optimalSolution(arr, k)));
        bruteForce(arr, k);
        System.out.println(Arrays.toString(arr));

        sc.close();}}

