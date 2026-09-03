import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    static char bruteForce(String s){
        for(int i =0; i<s.length();i++){
            int count =0;
            for(int j =0; j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){count++;}
            }
            if(count == 1){return s.charAt(i);}
        }
        return '-';
    }

    static char optimal(String s){
        int [] freq = new int[256];
        for(int i =0; i<s.length();i++){
                freq[s.charAt(i)]++;}
        for(int i = 0; i<s.length(); i++){
            if(freq[s.charAt(i)]==1){return s.charAt(i);}
        }
        return '-';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine().trim();
        // System.out.println(bruteForce(s));
        System.out.println(optimal(s));
        sc.close();
    }
}
