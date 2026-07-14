//Find the largest and smallest element in an array
public class LargestSmallestElement {

    static int largest(int []arr){
        int i=0;
        int max =arr[0];
        for(i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];}}
        return max;
    }

        static int smallest(int []arr){
        int i=0;
        int min = arr[0];
        for(i=1; i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];}}
        return min;
    }

    public static void main(String[] args) {
        int []arr = {89,5,6,7,4,3,2,1,78,9,0,-78,567};
        System.out.println("LargestNumber : "+largest(arr));
        System.out.println("SmallestNumber : "+smallest(arr));
        }
}
