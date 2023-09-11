public class findinarray {
    public static void main(String[] args) {
        int[] arr = {45,32,89,78,23,11,67};

        int ans = -1 ;

        int k = 78;

        for(int i=0;i<arr.length;i++){

            if(k==arr[i]){
                ans = i ;
               break;
            }
           

            
        }

        System.out.println(ans);
    }
}
