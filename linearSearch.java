public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 9, 0, 1, 7 };

        int k = 1;

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {

            if (k == arr[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);

    }
}
