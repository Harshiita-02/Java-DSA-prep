//Find the largest and smallest element in an array
//Time: O(n)
//Space: O(1) — no extra space used

//This is the linear scan / single-pass tracking pattern 
// — you'll see this exact shape reused constantly (finding max subarray sum,
//  finding peak element, tracking running max/min in sliding window problems). 
// Worth recognizing this as a category now, since Kadane's Algorithm (Q11 on your list)
//  is a direct extension of this same pattern.

import java.util.Arrays;
public class LargestSmallestElement {

    static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
    throw new IllegalArgumentException("Array must not be empty");
}
    int min = arr[0], max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min = arr[i];
    }
    return new int[]{min, max};}

    public static void main(String[] args) {
        int []arr = {89,5,6,7,4,3,2,1,78,9,0,-78,567};
        System.out.println(Arrays.toString(findMinMax(arr)));}
}

/*"Can you do this without the extra array allocation for the return?"
A: You could use two separate output parameters (not idiomatic in Java without 
wrapper objects), or just print inline, or return a Pair/custom object. The array
 approach is fine and common — just know alternatives exist.

Q: "What if the array is empty?"
A: Your code would throw ArrayIndexOutOfBoundsException on arr[0]. This is worth 
fixing — add a check:

java
if (arr == null || arr.length == 0) {
    throw new IllegalArgumentException("Array must not be empty");
}

This is a REAL gap — interviewers specifically probe edge cases like empty arrays,
 null arrays, single-element arrays. Always mention/handle this even if the interviewer
  doesn't ask directly — it shows maturity.

Q: "What if the array has only ONE element?"
A: Walk through it — min = max = arr[0], loop doesn't execute (starts at i=1, 
length is 1), returns {arr[0], arr[0]}. Correct, no fix needed — but be ready to
 trace through this out loud if asked.

Q: "Can you find min/max in fewer comparisons?"
A: Yes — there's a "pairwise comparison" technique that does it in ~3n/2 comparisons
 instead of 2n (compare elements in pairs against each other first, then compare 
 winners against current min/max). Advanced/rarely expected for Easy-level, but 
 good to KNOW exists if pushed on optimization.
*/