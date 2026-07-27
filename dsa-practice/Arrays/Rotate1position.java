/*Time: O(n) — one full pass to shift every element.
Space: O(1) — only one extra temp variable, regardless of array size.

Q: "Can you rotate by K positions, not just 1?"
 Don't just know how to do it by repeating your single
 -rotate function K times (that's O(n×k) — technically works but inefficient and looks
  naive).
The efficient trick — reversal algorithm (definitely mention this if asked):
For left-rotating by K: reverse first K elements, reverse remaining n-K elements,
 then reverse the WHOLE array.
*/
import java.util.Arrays;

public class Rotate1position{
    public static void main(String[] args) {
        //LEFT ROTATE
        // int []arr = {0,-34,6,5,3,2,1,435};
        // System.out.println(Arrays.toString(arr));
        // int temp = arr[0];
        // for(int i =0; i<arr.length-1; i++){
        //     arr[i]=arr[i+1];
        // }
        // arr[arr.length-1]= temp;
        // System.out.println(Arrays.toString(arr));

        //RIGHT ROTATE
        int []arr = {4,6,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        int temp = arr[arr.length-1];
        for(int i =arr.length-1; i>0; i--){
            arr[i]=arr[i-1];}
        arr[0]= temp;
        System.out.println(Arrays.toString(arr));
    }
}