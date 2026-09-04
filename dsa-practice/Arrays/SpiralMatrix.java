import java.util.ArrayList;

public class SpiralMatrix {

    static ArrayList<Integer> func(int [][]arr){
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int left =0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;
        while(top<=bottom && left<=right){  
        for(int i = left; i<=right; i++){result.add(arr[top][i]);}
        top++;
        for(int i = top; i<=bottom; i++){result.add(arr[i][right]);}
        right--;
        if(top<=bottom){
        for(int i = right; i>=left; i--){result.add(arr[bottom][i]);}
        bottom--;}
        if(left<=right){
        for(int i = bottom; i>=top; i--){result.add(arr[i][left]);}
        left++;}}
        return result;
    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25}};

        System.out.println(func(arr));
    }
    
}
