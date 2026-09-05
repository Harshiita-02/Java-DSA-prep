import java.util.Arrays;

public class SubarrayWithTargetSum {
    static int [] subarray(int []arr, int target){
        int sum =0;
        int l =0;
        for(int r = 0; r<arr.length; r++){
            sum+=arr[r];
            while(sum>target && l<=r){
                sum-=arr[l];
                l++;
            }
            if(sum==target){
                return new int []{l,r};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,7,5};
        int target = 12;
        System.out.println(Arrays.toString(subarray(arr, target)));
    }
}
