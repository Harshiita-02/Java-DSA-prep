//Insertion Sort
//Keep the left part sorted and insert the next element into its correct position.
//Best Case	O(n)	Array is already sorted, so the inner loop breaks after one comparison each pass.
// Average Case	O(n²)	Elements need to be shifted/swapped a moderate amount.
// Worst Case	O(n²)	Array is reverse sorted, so each element moves all the way to the beginning.
//Space Complexity (SC)O(1)
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;}

    public static void sort(int []arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j =i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,  j);}
                else{break;} }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();}
System.out.println(Arrays.toString(arr));
sort(arr);
System.out.println(Arrays.toString(arr));

        
    sc.close();}
}
