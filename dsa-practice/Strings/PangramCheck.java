public class PangramCheck{
    static boolean bruteforce(String s){
        s= s.toLowerCase();
        for(char c ='a'; c<='z'; c++){
            boolean seen = false;
            for(int i =0; i<s.length(); i++){
                if(s.charAt(i)==c){
                    seen = true;
                    break;}}
            if(!seen){return false;}
        }
        return true;
    }

    static boolean optimal(String s){
        s= s.toLowerCase();
        boolean [] seen = new boolean[26];
        int count =0;
            for(int i =0; i<s.length(); i++){
                if(s.charAt(i)>='a' && s.charAt(i)<='z' && !seen[s.charAt(i)-'a']){
                   seen[s.charAt(i)-'a'] = true;
                    count++;}
        }
        return count ==26;
    }
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";
        System.out.println(bruteforce(s));
        System.out.println(optimal(s));
    }
}