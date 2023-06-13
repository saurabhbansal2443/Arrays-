public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 19, 100, 2, 0, 1 };

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            } else if (smax < arr[i]) {
                smax = arr[i];
            }
        }

        System.out.println(max +  "   " +smax);
    }
}
