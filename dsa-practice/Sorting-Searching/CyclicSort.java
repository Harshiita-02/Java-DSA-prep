/*Time: O(n)
Space: O(1) — in-place swaps only.

Q: "Given an array of size n containing numbers 1 to n with ONE missing, find it."
 (Problem 5)
A: Run cyclic sort first (or a variant), then scan through — the index i where 
arr[i] != i+1 reveals the missing number is i+1.

Q: "Now one number is missing AND one is duplicated, find both." (Problem 66 — 
MTX-asked)
A:Same cyclic sort setup,but during the sort,if you ever find arr[i]==arr[correctIndex
] while i != correctIndex, that value is your duplicate. After sorting, whichever 
 index doesn't hold index+1 reveals the missing number.
*/
import java.util.Arrays;
public class CyclicSort{
static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;}

    static void cyclicSort(int []arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                swap(arr, i, correctIndex);
            }
            else i++;
        }
    }
    public static void main(String[] args) {
        int []arr = {4,5,3,1,2,9,6,8,7};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}