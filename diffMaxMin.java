public class diffMaxMin {
    public static void main(String[] args) {
        int[] arr = {4,6,-1,0,5,3,9};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(max<arr[i]){
                max= arr[i];
            }

            if(min>arr[i]){
                min= arr[i];
            }
        }


        int diff = max - min;

        System.out.println(diff);
    }
}
