public class searching {
    public static void main(String[] args) {
        int[] arr = { 7, 86, 45, 34, 24, 67, 2, 9, 5, 0, 1 };

        int k = 677;

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                ans = i;
            }
        }

        System.out.println(ans);

    }
}