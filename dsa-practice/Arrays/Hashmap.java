import java.util.Scanner;
import java.util.HashMap;

public class Hashmap{   //TC = O(n + q), SC = O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            // int key = arr[i];
            // int freq=0;
            // if(map.containsKey(key)){freq = map.get(key);}
            // map.put(key, freq+1);}

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //     System.out.print("Enter the number of queries : ");
        //     int q = sc.nextInt();
        //     System.out.println("Enter the elements to find their frequency : ");
        //     while (q-- > 0) {
        //         int x = sc.nextInt();
        //         if(map.containsKey(x)){
        //             System.out.println("Frequency of " + x + " is: " + map.get(x));}
        // else{System.out.println("Frequency of " + x + " is: 0");}

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Element : " + entry.getKey() + ", Frequency : " + entry.getValue());
        }

            sc.close();
}
}