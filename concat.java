import java.util.*;

public class concat {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 6 };
        int[] arr2 = { 7, 8, 9 };

        int[] res = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            res[i + arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(res));

    }
}
