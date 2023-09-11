public class findDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {7,4,5,2,1,9};
        int[] arr2 = {8,9,1,2,3};


        for(int i=0 ;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
