import java.util.*;
public class memory {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int[] copy = arr;

        copy[0]=100;

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(copy));

    }
}
