public class twoSum {
    public static void main(String[] args) {
        int[] arr = {4,2,3,9,1,7};

        int k = 12 ;

        for(int i =0 ;i<arr.length;i++){

            for(int j = i+1 ;j<arr.length;j++){

                if( k == arr[i] + arr[j]){
                    System.out.println(i + "    " + j);
                }
            }
        }

    }
}
