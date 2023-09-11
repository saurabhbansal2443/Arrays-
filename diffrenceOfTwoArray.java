import java.util.Arrays;

public class diffrenceOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 9, 0, 0, 0 };
        int[] arr2 = { 9, 6, 4, 8 };

        int[] res = new int[arr1.length];

        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p3 = res.length - 1;

        int d = 0;

        while (p1 >= 0 || p2 >= 0) {

            int n1 = p1 >= 0 ? arr1[p1] : 0;
            int n2 = p2 >= 0 ? arr2[p2] : 0;
            int diff = 0;
            n1 = n1 + d;
            if (n1 >= n2) {
                diff = n1 - n2;
                d = 0;
            } else {
                diff = n1 + 10 - n2;
                d = -1;

            }

            res[p3] = diff;

            p1--;
            p2--;
            p3--;

        }
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                count++;
            } else {
                break;
            }
        }

        int[] res2 = new int[res.length - count];
        int itr = 0;
        for (int i = count; i < res.length; i++) {
            res2[itr] = res[i];
            itr++;
        }

        System.out.println(Arrays.toString(res2));
    }
}
