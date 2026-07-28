import java.util.Arrays;
public class XorSwap {
    static void xorSwap(int[] arr, int i, int j) {
    if (i != j) {           // guard against same-index call
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
    public static void main(String[] args) {
        int a = 56;
        int b=21;
        System.out.println(a + "   "+ b);
        a^=b;
        b^=a;
        a^=b;
        System.out.println(a + "   "+ b);
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        xorSwap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
}
