public class twoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,4,3,1,9};

        int k = 8 ;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i + "  " + j);
                    break;
                }
            }
        }
    }
}
