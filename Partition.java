import java.util.Arrays;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {-4,8,-7,9,2,4,1,0,1,5,-2,-6};

        int k =2;

        int[] res = new int[arr.length];

        int idx = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                res[idx]=arr[i];
                idx++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                res[idx]=arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
