public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6,5,4};
        int[] arr2 = {1,2,3,4,5,6};
        
        for(int i =0; i<arr1.length ; i++){
        for(int j =0; j<arr2.length ; j++){
            if(arr2[j]==arr1[i]){
                System.out.println(arr2[j]);}
        }}
    }
}
