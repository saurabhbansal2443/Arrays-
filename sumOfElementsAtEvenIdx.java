public class sumOfElementsAtEvenIdx {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,56,3,2,34,7};

        int sum =0;

        for(int i = 0;i<arr.length ;i+=2){
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}
