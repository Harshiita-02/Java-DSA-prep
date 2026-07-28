public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 45;
        int b =89;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;   // a now holds the sum
        b = a - b;   // b = (a+b) - b = original a
        a = a - b;   // a = (a+b) - originalA = original b
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
