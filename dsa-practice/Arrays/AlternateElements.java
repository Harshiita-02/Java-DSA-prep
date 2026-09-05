import java.util.Arrays;
import java.util.ArrayList;
public class AlternateElements {
    static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int[] alternate(int[]arr){//considering equal no. of +ves and -ves ->O(2N)
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i] >= 0){ positives.add(arr[i]);}
             else { negatives.add(arr[i]);}}

        for(int i = 0; i<arr.length/2; i++){
            arr[i*2] = positives.get(i);
            arr[i*2+1] = negatives.get(i);}
        return arr;
    }
    static int[] alternate2(int[]arr){//-->O(N)
        int positive = 0, negative = 1;
        int[] result = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            if(arr[i] >= 0 && positive<arr.length){
                result[positive]=arr[i];
                positive+=2;}
             else{
               result[negative]=arr[i];
                negative+=2;}
        }
        return result;
    }

    static int[] alternate3(int[]arr){//Not equal no. of +ves and -ves
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i] > 0){ positives.add(arr[i]);}
             else { negatives.add(arr[i]);}}

        if(positives.size()>=negatives.size()){
        for(int i = 0; i<negatives.size(); i++){
            arr[i*2] = positives.get(i);
            arr[i*2+1] = negatives.get(i);}

            int index = negatives.size()*2;
        for(int i= negatives.size(); i<positives.size(); i++){
            arr[index++]=positives.get(i);
        }}


        else{
            for(int i = 0; i<positives.size(); i++){
            arr[i*2] = positives.get(i);
            arr[i*2+1] = negatives.get(i);}

            int index = positives.size()*2;
        for(int i= positives.size(); i<negatives.size(); i++){
            arr[index++]=negatives.get(i);
        }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr= {-5, -2, 5, 8, -8, 10,5,4,3,2,3};
        // System.out.println(Arrays.toString(alternate(arr)));
        // System.out.println(Arrays.toString(alternate2(arr)));
        System.out.println(Arrays.toString(alternate3(arr)));
        
    }
}
