// Algorithm	        Time	                                    Space

// Bubble sort	        O(n) best (with flag) / O(n²) worst     	O(1)
// Selection sort	    O(n²) always	                            O(1)
// Insertion sort	    O(n) best / O(n²) worst         	        O(1)
// Merge sort   	    O(n log n) always	                        O(n)
// Quick sort   	    O(n log n) avg / O(n²) worst	            O(log n) avg / O(n) worst
// Cyclic sort  	    O(n)	                                    O(1)
// Binary(iterative)	O(log n)                        	        O(1)
// Binary(recursive)	O(log n)                          	        O(log n)

/*Q: "Walk me through why binary search is O(log n)."
A: Each iteration eliminates HALF the remaining search space — so after k iterations,
 you've narrowed n elements down to n/2^k. Solving n/2^k = 1 gives k = log₂n.

Q: "What if the array has duplicate values equal to target which index do you return?"
A: Your current code returns the FIRST mid it happens to land on that matches — not
 necessarily the first or last occurrence. If asked for "find first/last occurrence 
 of target," that's a different, related problem (bias the search left or right even
  after finding a match, instead of returning immediately) — good to know this is a 
  common follow-up variant. */
  
import java.util.Arrays;
import java.util.Scanner;

public class IterativeBinarySearch {

    static int bs(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
        return -1;
    }
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] <= arr[end];

        while (start <= end) {    
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;}

            if (isAsc) {
                if (target > arr[mid]) {start = mid + 1;}
                 else {end = mid - 1;}
                 } 
            else {
                if (target < arr[mid]) {start = mid + 1;} 
                else {end = mid - 1;}
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int target = sc.nextInt();
        System.out.println(bs(arr, target));

        sc.close();
    }
}