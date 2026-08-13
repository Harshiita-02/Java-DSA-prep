import java.util.Arrays;
public class MergeSort {
    static void mergeSort(int []arr, int start, int end){
        if(start>=end){return;}
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    static void merge(int []arr, int start, int mid, int end){
        int l = start;
        int r = mid+1;
        int []temp = new int[arr.length];
        int index=0;
        while(l<=mid && r<=end){
            if(arr[l]<=arr[r]){
                temp[index]=arr[l];
                index++;
                l++;}
            else{
                temp[index]=arr[r];
                index++;
                r++;}
        }
        while(l<=mid){
            temp[index]=arr[l];
                index++;
                l++;}
        while(r<=end){
            temp[index]=arr[r];
                index++;
                r++;}

        for(int i =start; i<=end; i++){
            arr[i]=temp[i-start];}

    }
    public static void main(String[] args) {
        int []arr = {4,6,5,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
