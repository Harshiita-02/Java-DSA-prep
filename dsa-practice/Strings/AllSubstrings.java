public class AllSubstrings {
    public static void main(String[] args) {
        String s = "xyz";
        // for(int i =0; i<s.length(); i++){--->(O(N^3))
        //     for(int j =i; j<s.length(); j++){
        //     System.out.println(s.substring(i, j+1));
        // }
        // }
        StringBuilder sb = new StringBuilder();//{--->(O(N^2))
        for(int i =0; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                sb.append(s.charAt(j));
            System.out.println(sb.toString());
        }
        }
    }
}
