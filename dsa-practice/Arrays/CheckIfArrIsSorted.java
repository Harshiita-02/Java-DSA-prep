public class CheckIfArrIsSorted {
    public static boolean check(int []arr){
        int i =1;
    while(i<arr.length){
        if(arr[i]>=arr[i-1]){
            i++;}
        else{return false;}
    }return true;
    }
    public static void main(String[] args) {
        int []arr = {0,0,0};
        System.out.println(check(arr));
    }
    
    
}
