import java.util.Arrays;

public class QuickSort {
    static void swap(int []arr, int a, int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void quickSort(int[]arr, int start, int end){
        if(start>=end){return;}
        int PartitionIndex = pi(arr,start,end);
        quickSort(arr, start, PartitionIndex-1);
        quickSort(arr, PartitionIndex+1, end);
    }
    static int pi(int[]arr, int start, int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while(arr[i]<=pivot && i<end){ i++;}
        while(arr[j]>pivot && j>start){j--;}
        if(i<j){
            swap(arr, i, j);
        }
        else{
            swap(arr, start, j);
        }
        return j;
    }

    public static void main(String[] args) {
        int []arr = {4,6,5,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    
    }
}
