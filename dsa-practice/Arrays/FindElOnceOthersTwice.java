public class FindElOnceOthersTwice {
    //62. Find the element that appears once while all others appear twice
    //BRUTEFORCE APPROACH --> TC = O(N^2), SC= O(1)
    static int loops(int[]arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){count++;}
            }
            if(count==1){return arr[i];}}
        return -1;
    }

    //BETTER APPROACH --> TC = O(3N), SC = O(max+1)
    static int hashing(int[]arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];}}

        int[]hash = new int[max+1];
        for(int i =0; i<arr.length; i++){hash[arr[i]]++;}
        for(int i =0; i<arr.length; i++){if(hash[arr[i]]==1)return arr[i];}
        return -1;
    }

    //OPTIMAL APPROACH --> TC=O(N), SC=O(1)
    static int xor(int []arr){
        int xor =0;
        for(int i =0; i<arr.length; i++){xor^=arr[i];}
        return xor;
    }
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(loops(arr));
        System.out.println(hashing(arr));
        System.out.println(xor(arr));
    }
}
