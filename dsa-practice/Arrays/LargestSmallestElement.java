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
