import java.util.Scanner;

public class CountOccurences {

    static int [] optimal(String s){
        int [] freq = new int [256];
        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine().trim();
        int [] frequency = optimal(s);
        System.out.print("Enter no. of characters to check : ");
        int q = sc.nextInt();
        char x=' ';
        while(q!=0){
            x = sc.next().trim().charAt(0);
            System.out.println(x+" -> "+frequency[(int)x]);
            q--;
        }
        
        sc.close();
    }
    
}
