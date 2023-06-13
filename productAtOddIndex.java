public class productAtOddIndex {
    public static void main(String[] args) {
        int[] arr ={2,5,4,2,5,6,3,2,4,8};

        int product = 1;

        for(int i=1;i<arr.length;i+=2){
            product*=arr[i];
        }

        System.out.println(product);
        
    }
}
