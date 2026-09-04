public class ContainerWithMostWater {
    static int bruteForce(int []arr){
        int maxArea=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                int width = j-i;
                int height = Math.min(arr[i], arr[j]);
                int area = width * height;
                maxArea = Math.max(maxArea, area); }
        }
        return maxArea;}

        static int optimal(int []arr){
        int maxArea=0;
        int l =0;
        int r = arr.length-1;
        while(l<r){
                int width = r-l;
                int height = Math.min(arr[r], arr[l]);
                int area = width * height;
                maxArea = Math.max(maxArea, area); 
                if(arr[l]>arr[r]){r--;}
                else{l++;}
        }
        return maxArea;}
    public static void main(String[] args) {
        int []arr ={1,8,6,2,5,4,8,3,7};
        System.out.println(optimal(arr));
    }
}
