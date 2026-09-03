import java.util.ArrayList;

public class LeadersOfAnArray {
    static ArrayList<Integer> bruteforce(int []arr){//TC->O(N^2), SC=O(N)
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            int j =i+1;
            while(j<arr.length){
                if(arr[j]<arr[i]){
                    j++;
                }
                else{break;}
            }
            if(j==arr.length){temp.add(arr[i]);}
        }
        return temp;
    }

    static ArrayList<Integer> optimal(int []arr){//TC->O(N), SC=O(N)
        ArrayList<Integer> temp = new ArrayList<>();
        int max = arr[arr.length-1];
        temp.add(0,max);
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i]>max){
                max = arr[i];
                temp.add(0,max);
            }
        }
        
        
        return temp;
    }
    public static void main(String[] args) {
        int[]arr={2,6,7,8,2,3,4,2};
    System.out.println(bruteforce(arr).toString());
    System.out.println(optimal(arr).toString());
    }
}
