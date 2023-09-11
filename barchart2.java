public class barchart2 {
    public static void main(String[] args) {
        int[] arr = {8,6,2,1,9,4,3};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        for(int level = max ; level>=1;level--){

            for(int i=0;i<arr.length;i++){
                if(level<=arr[i]){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
