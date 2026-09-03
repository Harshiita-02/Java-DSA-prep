import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {

    static boolean bruteForce(String s1, String s2){
        if(s1.length()!=s2.length()){return false;}
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i =0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){return false;}
        }
        return true;
    }

    static boolean optimal(String s1, String s2){
        if(s1.length()!=s2.length()){return false;}
        int []freq = new int [26];
        for(int i =0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int count : freq){if(count != 0){return false;}}
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = sc.nextLine().trim();
        System.out.print("Enter another string : ");
        String s2 = sc.nextLine().trim();
        // System.out.println(bruteForce(s1, s2));
        System.out.println(optimal(s1, s2));


        sc.close();
    }
    
}
