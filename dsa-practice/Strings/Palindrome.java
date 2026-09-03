import java.util.Scanner;

public class Palindrome{
    static void recursive(String s, int start, int end){
        if(start>=end){
            System.out.println("Palindrome");
            return;
        }
        if(s.charAt(start)!=s.charAt(end)){
            System.out.println("NOT a palindrome");
            return;
        }
        recursive(s,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine().trim().toLowerCase();

        int start = 0;
        int end = s.length()-1;
        // while(start <end){
        //     if(s.charAt(start)==s.charAt(end)){
        //     start++;
        //     end--;}
        
        // else{
        //     break;
        // }}

        // if(start>=end){
        //     System.out.println("NOT a palindrome");
        // }
        // else{
        //     System.out.println("Palindrome");
        // }
        System.out.println("Using Recursion");
        recursive(s,start,end);
    sc.close();}
}


// Iterative approach:

// Time Complexity: O(n) — the two pointers (start, end) move toward each other, together covering at most n characters total.
// Space Complexity: O(1) — only two integer variables used, no extra memory that grows with input size.

// Recursive approach:

// Time Complexity: O(n) — same idea, one recursive call per pointer step, so n/2 calls total, which is still O(n).
// Space Complexity: O(n) — this is the difference. Every recursive call adds a new frame to the call stack, and it stays there until that call returns. So for a string of length n, you build up to n/2 stack frames before anything starts returning.