import java.util.HashSet;
import java.util.Arrays;
public class FindDuplicateElements {
    static int [] findDuplicate(int []arr){
            HashSet<Integer> set = new HashSet<>();
            int index = 0;
            int temp[]= new int[arr.length];
            for(int i =0; i<arr.length; i++){
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                    temp[index++]=arr[i];}
            }
            return temp;
        }

        static int twoPtr(int []arr){
            Arrays.sort(arr);
            int i = 0;
            for(int j =1; j<arr.length ; j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];}
            }
            return i+1;
        }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,1,43,3,43};
        System.out.println(Arrays.toString(findDuplicate(arr)));
        int index = twoPtr(arr);
        for(int i=index; i<arr.length ; i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
        }}

