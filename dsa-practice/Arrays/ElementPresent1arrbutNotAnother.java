import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
public class ElementPresent1arrbutNotAnother {
    static ArrayList<Integer> findElements(int []arr1,int []arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> temp = new ArrayList<>();
        int l=0;
        int r=0;
        while(l<arr1.length && r<arr2.length){
            if(arr2[r]<arr1[l]){r++;}
            else if(arr2[r]>arr1[l]){
                temp.add(arr1[l]);
                l++;}
            else{l++;r++;}}

        while(l<arr1.length){
            temp.add(arr1[l]);
            l++;}
        return temp;
    }

    static ArrayList<Integer> findElementsOptimal(int []arr1,int []arr2){
        ArrayList<Integer> temp = new ArrayList<>();
       HashSet <Integer> set = new HashSet<>();
       for(int i =0; i<arr2.length; i++){
           set.add(arr2[i]);}
        for(int i =0; i<arr1.length; i++){
            if(!set.contains(arr1[i])){
                temp.add(arr1[i]);}}    
        return temp;
    }
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {1,2,3};
        System.out.println(findElements(arr1, arr2));
        System.out.println(findElementsOptimal(arr1, arr2));
}}