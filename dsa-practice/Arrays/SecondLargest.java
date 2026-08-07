public class SecondLargest {
//BruteForce =merge/quick sort + loop finding 2ndlargest from end TC = O(nlogn+n)
    public static int BetterSolution(int[] arr) {//TC = O(2N)
        if (arr.length < 2) {throw new IllegalArgumentException("Array must have at least 2 elements");}
        int secondLargest = Integer.MIN_VALUE;
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {largest = num;}}
        for (int i : arr){
            if(i>secondLargest && i!=largest){secondLargest=i;}}
        return secondLargest;}

        public static int OptimalSolution(int[] arr) {//TC = O(N)
        if (arr.length < 2) {throw new IllegalArgumentException("Array must have at least 2 elements");}
        int secondLargest = Integer.MIN_VALUE;
        int largest = arr[0];
        for(int i : arr){
        if(i>largest){
            secondLargest=largest;
            largest=i;}
        else if(i>secondLargest && i!=largest){secondLargest=i;}}
        return secondLargest;}

    public static void main(String[] args) {
        int[] arr = {7,7,7};
        System.out.println("Second largest: " + BetterSolution(arr));
        System.out.println("Second largest: " + OptimalSolution(arr));
    }
}
