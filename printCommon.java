public class printCommon {
    public static void main(String[] args) {
        int[] arr1={5,7,3,2,1};
        int[] arr2={9,4,3,5,0,8,6,5};


        for(int i =0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){

                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
