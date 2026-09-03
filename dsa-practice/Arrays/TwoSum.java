import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int [] bruteForce(int[]arr, int target){
        for(int i =0; i<arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int [] better(int[]arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int complement = target - arr[i];
                if(map.containsKey(complement)){
                    return new int[]{i,map.get(complement)};    
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }


    static int [] optimal(int[]arr, int target){
        int [][]numsWithIndex = new int[arr.length][2];
        for(int i =0; i<arr.length; i++){
            numsWithIndex[i][0]=arr[i];
            numsWithIndex[i][1]=i;
        }
        Arrays.sort(numsWithIndex,(a,b )->Integer.compare(a[0], b[0]));
        int l =0;
        int r = arr.length-1;
        while(l<r){
            int sum = numsWithIndex[l][0]+numsWithIndex[r][0];
            if(sum==target){return new int []{numsWithIndex[l][1], numsWithIndex[r][1]};}
            else if(sum<target){l++;}
            else{r--;}
        }
        return new int []{-1,-1};
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 6,8,11, 15};
        int target = 14;
        System.out.println(Arrays.toString(optimal(arr, target)));
    }
}
