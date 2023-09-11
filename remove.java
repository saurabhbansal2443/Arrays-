public class remove {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8};

        int k = 4;

        int[] res  = new int[arr.length-1];

        int itr = 0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=k){
                res[itr]=arr[i];

                itr++;
            }
        }
    }
}
