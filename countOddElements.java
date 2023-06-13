public class countOddElements {
    public static void main(String[] args) {
        int[] arr = {2,3,53,2,9,4,0,7};

        int count = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }

        System.out.println(count);
    }
}
