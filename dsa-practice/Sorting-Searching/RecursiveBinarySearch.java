/*Q: "Why pass isAsc as a parameter instead of making it a field/global?"
A: Keeps the function pure/stateless — no shared mutable state, safe for concurrent 
calls, easier to test/reason about. Good instinct to have used a parameter rather 
than a static field.

Q: "Is this tail-recursive? Does Java optimize tail recursion?"
A: Yes, structurally this IS tail-recursive (the recursive call is the LAST operation,
 nothing happens after it returns). But Java does NOT perform tail-call optimization
  (unlike some other languages) — so this still consumes O(log n) stack frames 
  regardless. Genuinely good one to mention if asked about optimizing further — shows
   deeper JVM awareness. */
   
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {

    static int bs(int[] arr, int target, int start, int end, boolean isAsc) {

        if (start > end || arr == null || arr.length == 0) {return -1;}

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {return mid;}

        if (isAsc) {
            if (target > arr[mid]) {return bs(arr, target, mid + 1, end, isAsc);}
            else {return bs(arr, target, start, mid - 1, isAsc);}
        } else {
            if (target < arr[mid]) {return bs(arr, target, mid + 1, end, isAsc);}
            else {return bs(arr, target, start, mid - 1, isAsc);}
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}

        System.out.println(Arrays.toString(arr));
        int target = sc.nextInt();

        boolean isAsc = arr[0] <= arr[arr.length - 1];
        int index = bs(arr, target, 0, arr.length - 1, isAsc);
        System.out.println(index);

        sc.close();
    }}
