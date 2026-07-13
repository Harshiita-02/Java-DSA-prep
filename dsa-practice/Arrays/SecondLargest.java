// Problem: Find the second largest element in an array without sorting
// Category: Arrays | Difficulty: Easy
//
// Approach:
// Do a single pass through the array. Track the largest and second-largest
// values seen so far. Whenever we find a new largest, the old largest
// becomes the new second-largest. If a number is between the two, it only
// updates second-largest.
//
// Time Complexity: O(n) — single pass through the array
// Space Complexity: O(1) — only two extra variables used

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest: " + findSecondLargest(arr));
        // Expected output: 34
    }
}
