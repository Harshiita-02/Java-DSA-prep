// Time: Worst/average case O(n²) — two nested loops. With the swap-flag fix, 
// best case becomes O(n) if the array is already sorted (one pass, no swaps,
//  breaks immediately).
// Space: O(1) — in-place, only a temp variable used in swap

/*Q: "Is Bubble Sort stable?" (meaning: does it preserve the relative order of equal
 elements?)
A: Yes — it only swaps ADJACENT elements when one is STRICTLY greater than the next
 (>, not >=), so equal elements never swap past each other, preserving their original
  relative order.

Q: "When would you actually use Bubble Sort in real code?"
A: Almost never in production — O(n²) is bad for large datasets. It's mainly taught
 for understanding sorting fundamentals and the "optimize with early exit" pattern.
  Real code uses Collections.sort()/Arrays.sort() (which use Timsort/Dual-Pivot 
  Quicksort internally).
*/
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
            for(int j =0; j<arr.length-1-i; j++){
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
