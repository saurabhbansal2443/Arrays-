public class frequency {
    public static void main(String[] args) {
        int[] arr = {2,3,45,2,3,42,52,2,2,2,5};
        int k = 2;

        int count =0;

        for(int i =0 ;i<arr.length;i++){
            if( k == arr[i]){
                count++;
            }
        }

        System.out.println(count);

    }
}
