//LINEAR SEACH
//Time: O(n) — worst case scans the entire array (target at the end or not present)
//Space: O(1)

//Follow-up
// Question to have ready (very likely in a live interview after this): 
//"Can you do better than O(n)?" — Answer: only if the array is sorted, in which
// case Binary Search gets you to O(log n). If unsorted, O(n) is actually optimal for search,
// since in the worst case you must inspect every element at least once — there's no way around
// that without additional structure (like a hash map for O(1) average lookup, but that requires
// O(n) extra space to build).

//Pattern
//This is about as foundational as it gets — the linear scan pattern, same base shape as Q1
//  (min/max) but now with early termination on a match. Good to explicitly connect: "single pass 
// + early exit" is its own small variant worth recognizing, since it shows up in problems like 
// "find first negative number," "check if any element satisfies X," etc.


public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;}

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index; }}

        return -1;}

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 25, 50};
        int target = 25;
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");}
    }
}