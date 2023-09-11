public class concat2 {
    public static void main(String[] args) {
        int[] arr1 = { 10, 90, 56, 78, 98 };
        int[] arr2 = { 45, 34, 78, 23, 98, 10, 11, 12 };

        int[] ans = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            ans[i + arr1.length] = arr2[i];
        }
        for (int i = 0; i < ans.length; i++) {
           System.out.print(ans[i] + "  ");
        }

    }
}
