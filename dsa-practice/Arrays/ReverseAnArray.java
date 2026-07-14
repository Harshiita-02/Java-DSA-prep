//Reverse an array in place
//Time: O(n) — technically O(n/2) swaps, but that simplifies to O(n)
//Space: O(1) — correctly in-place, no auxiliary array

//This is the two-pointer (converging pointers) pattern — same family as palindrome
//  checking, and it'll come up constantly: checking if a string/array is a palindrome, 
// container-with-most-water, 3Sum (after sorting), trapping rainwater. Worth explicitly 
// recognizing "two pointers starting from both ends, moving inward" as its own category 
// now — you'll reuse this shape a lot.

import java.util.Scanner;
import java.util.Arrays;
public class ReverseAnArray {

    static void swap(int []arr, int start, int end){
        while(start<end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;}}

    public static void main(String[] args) {
        int [] arr = new int[10];
        int start =0;
        int end = arr.length-1;
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt(); }
        System.out.println(Arrays.toString(arr));
       
        swap(arr, start, end); 
        System.out.println(Arrays.toString(arr));   

        
sc.close();}
    
}
