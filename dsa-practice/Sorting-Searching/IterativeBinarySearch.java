//| Algorithm    |Best TC| Average TC | Worst TC | Space Complexity (SC) 
//| ------------ | ----- | -----------| ---------| ------------------------
//| Iterative BS |  O(1) |  O(log n)  | O(log n) | O(1)                       
//| Recursive BS |  O(1) |  O(log n)  | O(log n) | O(log n) (recursion stack) 

import java.util.Arrays;
import java.util.Scanner;

public class IterativeBinarySearch {

    static int bs(int[] arr, int target) {
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