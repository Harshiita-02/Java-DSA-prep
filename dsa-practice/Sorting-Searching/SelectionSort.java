/*Time: O(n²) in ALL cases — best, average, AND worst. This is the key thing that 
distinguishes it from Bubble/Insertion Sort: even if the array is already sorted,
 Selection Sort STILL scans the full remaining unsorted portion every single pass 
 to confirm the minimum — there's no early-exit optimization possible here, because
  you can't know something is already the minimum without checking everything after it.

Space: O(1) — in-place, just the swap's temp variable.

Q: "Compare Bubble Sort, Insertion Sort, and Selection Sort — when would you pick each?"
A:
Selection Sort: fewest actual SWAPS (exactly n-1 max) — useful when write/swap
 operations are expensive (e.g., writing to flash memory), even though comparisons 
 are still O(n²).
Bubble Sort: has early-exit (O(n) best case), but does more swaps overall.
Insertion Sort: best for NEARLY sorted data (O(n) best case, and performs well even 
on partially sorted real-world data) — generally the best of the three simple sorts 
in practice.

Q: "Is Selection Sort stable?"
A: No — this is a genuine gotcha to know. Unlike Bubble Sort, Selection Sort's swap 
can jump a min element PAST equal elements, changing their relative order.Worth 
mentioning proactively: "Selection Sort is NOT stable, unlike Bubble/Insertion Sort" */
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
