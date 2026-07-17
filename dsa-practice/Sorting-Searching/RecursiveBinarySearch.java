import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {

    // CHANGE 1: Added 'boolean isAsc' as a parameter
    static int bs(int[] arr, int target, int start, int end, boolean isAsc) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // CHANGE 2: Removed
        // boolean isAsc = arr[start] <= arr[end];
        // because the array order never changes during recursion.

        if (isAsc) {
            if (target > arr[mid]) {
                return bs(arr, target, mid + 1, end, isAsc); // CHANGE 3: Pass isAsc
            } else {
                return bs(arr, target, start, mid - 1, isAsc); // CHANGE 3
            }
        } else {
            if (target < arr[mid]) {
                return bs(arr, target, mid + 1, end, isAsc); // CHANGE 3
            } else {
                return bs(arr, target, start, mid - 1, isAsc); // CHANGE 3
            }
        }
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

        // CHANGE 4: Calculate isAsc only once
        boolean isAsc = arr[0] <= arr[arr.length - 1];

        // CHANGE 5: Pass isAsc to the recursive function
        int index = bs(arr, target, 0, arr.length - 1, isAsc);

        System.out.println(index);

        sc.close();
    }
}