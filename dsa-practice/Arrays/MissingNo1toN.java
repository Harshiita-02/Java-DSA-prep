import java.util.Arrays;
import java.util.HashSet;
public class MissingNo1toN {
static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;}

    static int missingmath(int []arr){
        int n = arr.length+1;
        int sum = 0;    
        int expectedSum = n*(n+1)/2;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];}
        
        return expectedSum - sum;}

    static int missing2loops(int []arr){
        int n = arr.length+1;
        for(int i = 1; i<n; i++){
            boolean found = false;
            for(int j = 0; j<n-1; j++){
                if(arr[j]==i){found = true; break;}}
            if(!found) return i;}
        return n;
    }

    static int missing2Xors(int[]arr){
        int n = arr.length+1;
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0; i<arr.length; i++){
            xor1^=arr[i];}
        for(int i =1; i<=n; i++){
            xor2^=i;}
        return xor1^xor2;}
    
    static int missingHashSet(int[]arr){
        int n = arr.length+1;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            set.add(arr[i]);}
        for(int i =1; i<=n; i++){
            if(!set.contains(i)) return i;}
        return n;}

    static int cyclicSortMissing(int[] arr) {
        int n = arr.length + 1;
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] <= arr.length && arr[correctIndex] != arr[i]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int []arr = {4,5,2,1};
        System.out.println(Arrays.toString(arr));  
        System.out.println(cyclicSortMissing(arr));
        System.out.println(missingHashSet(arr));
        System.out.println(missingmath(arr));
        System.out.println(missing2loops(arr));
        System.out.println(missing2Xors(arr));
        
    }
}

