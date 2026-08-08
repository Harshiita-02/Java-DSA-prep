import java.util.Scanner;

public class Hashing {

    public static void hashing(int[] arr, int n, Scanner sc) {//TC = O(n + q), SC = O(1)
        int[] hash = new int[100];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();
        System.out.println("Enter the elements to find their frequency : ");
        while (q-- > 0) {
            int x = sc.nextInt();
            System.out.println("Frequency of " + x + " is: " + hash[x]);
        }
    }

    public static void characterHashing(String s, Scanner sc) {//TC = O(n + q), SC = O(1)
        int[] hash = new int[256]; //[26] for lowercase letters only
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++; //hash[s.charAt(i) - 'a']++ for lowercase letters only
        }
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();
        System.out.println("Enter the elements to find their frequency : ");
        while (q-- > 0) {
            char x = sc.next().charAt(0);
            System.out.println("Frequency of " + x + " is: " + hash[x]); //hash[x - 'a'] for lowercase letters only
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); }

        hashing(arr, n, sc);

        sc.close();
    }
}