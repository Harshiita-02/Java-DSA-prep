import java.util.ArrayList;
//70. Find the leaders in an array (element greater than all elements to its right
public class LeaderElements {
    
    static ArrayList<Integer> findLeaderElements(int[] arr) {//TC=O(N^2);SC=O(N)
        ArrayList<Integer>temp = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            int j = i+1;
            while(j<arr.length){
                if(arr[j]<=arr[i]){
                    j++;}
                else{break;}
            }
            if(j==arr.length){temp.add(arr[i]); }
        }
        return temp;
    }

    static ArrayList<Integer> l2r(int[] arr) {//TC=O(N);SC=O(N)
        ArrayList<Integer>temp = new ArrayList<>();
        int max = arr[arr.length-1];
        temp.add(0,max);
        for(int i =arr.length-2; i>=0; i--){
            if(arr[i]>max){
                max=arr[i];
                temp.add(0,max);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeaderElements(arr));
        System.out.println(l2r(arr));
    }
    
}
