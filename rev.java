public class rev{
    public static void main(String[] args) {
        int[] arr = {10,7,6,5,4,1};

     int[] res = new int[arr.length];  

        for(int i= 0;i<arr.length;i++){  
            res[i] = arr[i];
        }


        // int start = 0 ;
        // int end = arr.length-1;

        // while(start<end){

        //     int k = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = k;

        //     start++;
        //     end--;
        // }



        for(int i=0;i<arr.length;i++){
            System.out.print(res[i] + "  ");
        }
    }
}