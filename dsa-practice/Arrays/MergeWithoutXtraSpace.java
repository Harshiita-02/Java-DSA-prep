import java.util.Arrays;
public class MergeWithoutXtraSpace{
    static void swap(int arr1[], int arr2[], int i, int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;}

    static void mergeBruteForce(int arr1[], int arr2[], int n , int m){
        int []temp = new int[n+m];
        for(int i =0; i<n; i++){
            temp[i]=arr1[i];}
        for(int i =0; i<m; i++){
            temp[n+i]=arr2[i];}
        Arrays.sort(temp);
        for(int i =0; i<n; i++){
            arr1[i]=temp[i];}
        for(int i =0; i<m; i++){
            arr2[i]=temp[n+i];}
    }
    static void mergeOPtimal(int arr1[], int arr2[], int n , int m){
        int l=n-1;
        int r=0;
        while(l>=0 && r<m){
            if(arr1[l]>arr2[r]){
                swap(arr1,arr2,l,r);
                l--;r++;}
            else{break;} }
            Arrays.sort(arr1);
            Arrays.sort(arr2);}
    
        public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] = {2, 3, 8, 13};
        int n = arr1.length;
        int m = arr2.length;
        mergeOPtimal(arr1, arr2, n, m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}