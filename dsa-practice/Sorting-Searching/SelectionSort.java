import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;}

    public static void sort(int []arr){
        for(int i =0; i<arr.length-1; i++){
            int min = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;} }

if(min!=i){
swap(arr,i,  min);}
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
