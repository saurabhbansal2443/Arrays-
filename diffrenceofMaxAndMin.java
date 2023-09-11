public class diffrenceofMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {7,3,4,2,0,8,9,1};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(max<arr[i]){
                max = arr[i];
            }

             if(min>arr[i]){
                min = arr[i];
            }
        }

        int diff = max - min ;

        System.out.println(diff);
    }
}
