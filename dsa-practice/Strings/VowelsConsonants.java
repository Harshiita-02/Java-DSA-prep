import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine().trim().toLowerCase();
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // only count plain English letters a-z, skip everything else
            if (c < 'a' || c > 'z') continue;

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowels : " + vowelCount);
        System.out.println("Consonants : " + consonantCount);

        sc.close();
    }
}