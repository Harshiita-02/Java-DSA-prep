import java.util.Scanner;

public class RemoveDuplicateCharacters {
    static String bruteForce(String s){
        char []arr = new char[s.length()];
        int idx = 0;
        for(int i =0; i<s.length();i++){
            boolean isDuplicate = false;
            for(int j =0; j<idx;j++){
                if(s.charAt(i)==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[idx++] = s.charAt(i);
            }
        }
        return new String(arr, 0, idx);
    }


    static String optimal(String s){
        boolean [] freq = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length();i++){
            if(!freq[s.charAt(i)]){
                sb.append(s.charAt(i));
                freq[s.charAt(i)] = true;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine().trim();
        System.out.println(bruteForce(s));
        System.out.println(optimal(s));
        sc.close();
    }
}
