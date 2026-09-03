import java.util.Scanner;
import java.util.Stack;

public class ReverseString {    
    // static boolean isLetter(char c){
    //     return (c>='a' && c<='z' ||c>='A' && c<='Z');
    // }
    
    static String charArrayReverse(String s){
       char []arr =  s.toCharArray();
       int start =0; int end = arr.length-1;
       while(start<end){
        // if(!isLetter(arr[start])){start++;} --> Reverse string but keep special characters fixed in place
        // else if(!isLetter(arr[end])){end--;}
        // else{
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;}
        //}
       String reversed = new String(arr);
        return reversed;}

        static String stackReverse(String s){
            Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray()){st.push(c);}
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){sb.append(st.pop());}
            return sb.toString();}

        static String recursiveReverse(String s){
            if(s.isEmpty()){return s;}
            return recursiveReverse(s.substring(1))+s.charAt(0);
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine().trim();
        // System.out.println(charArrayReverse(s));
        // System.out.println(stackReverse(s));
        System.out.println(recursiveReverse(s));


        // String reversed = new StringBuilder(s).reverse().toString();
        // System.out.println(reversed);

   sc.close(); }
}