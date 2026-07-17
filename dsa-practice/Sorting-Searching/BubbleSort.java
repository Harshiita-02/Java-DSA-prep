// Time: Worst/average case O(n²) — two nested loops. With the swap-flag fix, 
// best case becomes O(n) if the array is already sorted (one pass, no swaps,
//  breaks immediately).
// Space: O(1) — in-place, only a temp variable used in swap

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;}

    static void bubbleSort(int []arr){
        for(int i = 0; i<arr.length-1; i++){
             boolean swaps = false;
            for(int j =0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                        swaps=true;}
            }
            if(!swaps){break;}
        }

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];

        for(int i =0; i<n; i++){
        arr[i]= sc.nextInt(); }

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
       
    sc.close();
    
    }
    
}
