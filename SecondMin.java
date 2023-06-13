public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {3,2,1,-20,78,65};


        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i =0 ;i<arr.length ;i++){
            if(min>arr[i]){
                smin = min ;
                min = arr[i];
            }else if ( smin > arr[i]){
                smin = arr[i];
            }
        }


        System.out.println(min + "   " + smin);
    }
}
