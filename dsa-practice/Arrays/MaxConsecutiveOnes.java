public class MaxConsecutiveOnes {
    static int maxones(int []arr){
        int count =0;
        int max = 0;
        for(int i =0; i<arr.length ; i++){
            if(arr[i]==1){count++;}
            else{count=0;}

            if(count>max){max=count;}
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1};
        System.out.println(maxones(arr));
    }
}
