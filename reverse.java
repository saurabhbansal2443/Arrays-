public class reverse {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,6,4,8,0};

        // First way using a new array 

        // int[] res= new int[arr.length];

        // for(int i = arr.length-1;i>=0;i--){
        //     res[arr.length-i-1]=arr[i];
        // }

        // for(int i =0;i<res.length;i++){
        //     System.out.println(res[i]);
        // }

        // Second Way transforming the same array 

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+ "  ");
            }

       



    }
}
