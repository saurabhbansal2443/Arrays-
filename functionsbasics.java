import java.util.Arrays;

public class functionsbasics {
    public static void main(String[] args) {
        // int ans =fact(6);

        // System.out.println(ans);
     int[] arr = {1,2,3,4,5};

     reverse(arr);

     System.out.println(Arrays.toString(arr));
    }

    public static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }

        return sum;
    }

    public static void fib(int n) {

        if (n == 1) {
            System.out.println(0);
            return;
        } else if (n == 2) {
            System.out.println(0 + "  " + 1);
            return;
        }

        int ft = 0;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            int tt = ft + st;

            System.out.println(ft);

            ft = st;
            st = tt;
        }
    }

    public static int armstrong(int n ){

        int sum = 0 ;

        while(n>0){
            int d = n%10 ;
            sum = sum + d*d*d;
            n=n/10;
        }
        System.out.println(n);
        return sum ;
    }

    public static void reverse(int[] arr){

        int start = 0 ;
        int end = arr.length -1 ;


        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++;
            end--;
        }
    }
}
