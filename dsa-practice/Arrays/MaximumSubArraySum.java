import java.util.ArrayList;

public class MaximumSubArraySum {
    static int  bruteforce(int []arr){
        int maxSum =Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
             int sum =0;
            for(int j =i; j<arr.length; j++){
                sum+=arr[j];
                maxSum = Math.max(maxSum, sum);}}
        return maxSum;
    }

    static int  kadanes(int []arr){
        int maxSum =Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
            if(sum>maxSum){maxSum=sum;}
            if(sum<0){sum=0;}}
        return maxSum;
    }

    static ArrayList<Integer>  kadanesSubArray(int []arr){
        ArrayList<Integer> result = new ArrayList<>();
        int maxSum =Integer.MIN_VALUE;
        int sum =0;
        int ansStart=-1;
        int ansEnd=-1;
        int start = 0;
        for(int i =0; i<arr.length; i++){
            
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){sum=0;start=i+1;}}

            for(int i = ansStart ; i<=ansEnd; i++){
                result.add(arr[i]);
            }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {-2,-3,-3,4,-1,2,1,-5,4};
        System.out.println(kadanesSubArray(arr));
    }
}
