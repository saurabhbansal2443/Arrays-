import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 1, 6, 2, 3, 9 };

        int k = 1;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                count++;
            }
        }

        int[] res = new int[arr.length - count];

        int itr = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                res[itr] = arr[i];
                itr++;
            }
        }

        System.out.println(Arrays.toString(res));

    }
}