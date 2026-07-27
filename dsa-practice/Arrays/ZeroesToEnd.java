import java.util.Arrays;
import java.util.Scanner;
public class ZeroesToEnd{

    static void usingTemp(int []arr){//Complexity: Time O(n), Space O(n)
        int []temp = new int [arr.length];
         int j =0;
         int i=0;
        while(i<arr.length && j<arr.length){
            if(arr[j]!=0)
                {temp[i]=arr[j];
                    i++;}
            j++;}
       
        for(int k =0; k<arr.length; k++){
            arr[k]=temp[k];}
    }

static void swap(int []arr, int a, int b){
    int temp = arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}
    static void using2ptr(int []arr){//Complexity: Time O(n), Space O(1)
        int l=0;
        for(int r=0;r<arr.length; r++){
            if (arr[r]!=0) {
                swap(arr,l,r);
               l++; 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i]= sc.nextInt();}
        System.out.println(Arrays.toString(arr));
        // usingTemp(arr);
        // System.out.println(Arrays.toString(arr));     
        using2ptr(arr);   
        System.out.println(Arrays.toString(arr));        

        
        sc.close();
    }
}

/*Q: "Does the two-pointer approach preserve the relative order of non-zero elements?"
A: Yes — walk through your trace above, 1, 3, 12 stay in their original relative 
order. Important to confirm you understand WHY: because l only ever moves forward
 as it finds non-zeros in the SAME left-to-right scan order as r.

Q: "What if the array has ALL zeros, or NO zeros?"
A: Trace both mentally — all zeros: l never advances, nothing swaps, array unchanged
 (correct, already all zeros). No zeros: every element swaps with itself (l==r every 
 time), array unchanged (correct). Good edge cases to mention proactively. */