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
/*Q: "Why is this O(n) and not O(n/2)? Doesn't the loop run half as many times?"
A: Big-O drops constants — O(n/2) and O(n) are the same complexity CLASS. This is 
a genuinely common trip-up; make sure you can explain WHY constants get dropped if 
pushed (as n grows large, the constant factor becomes irrelevant to the growth RATE,
 which is what Big-O measures).

Q: "Can you reverse it without a temp variable?"
A: Yes — XOR swap trick (you already know this from Basic Math #36 in your prep list!)
arr[start] ^= arr[end];
arr[end] ^= arr[start];
arr[start] ^= arr[end];

Real gotcha to mention if asked: XOR swap BREAKS if start == end (XORing a number with
 itself gives 0, wiping the value) — but since your loop condition is start < end,
  you never hit that case here, so it'd be safe. Good to say this out loud — shows
   depth.

Q: "What if I ask you to reverse only a PART of the array, say index 2 to 6?"
A: You already handle this! Your method takes start and end as parameters — that's 
actually a nice design choice, whether intentional or not. Point it out if asked: 
"my reverse function already supports partial-range reversal since it's parameterized."*/