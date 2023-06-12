public class firstAndLast {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,2,6,2,3,2,9,0,1};
        int k=6;


   // first method using two loops 

        // int fo=-1;
        
        // for(int i=0;i<arr.length;i++){

        //     if(k==arr[i]){
        //         fo=i;
        //         break;
        //     }
        // }

        // int lo=-1;
        
        // for(int i=arr.length-1;i>=0;i--){

        //     if(k==arr[i]){
        //         lo=i;
        //         break;
        //     }
        // }

        // System.out.println(fo);
        // System.out.println(lo);


        // second method using single loop 

            int fo = -1 ;
            int lo = -1 ;

            boolean flag = true ;

            for(int i =0 ;i<arr.length ; i++){

                if( arr[i]==k && flag == true){
                    fo = i;
                   
                    flag = false;
                
                }
                if ( arr [i]==k){
                    lo = i;
                }
            }

            System.out.println(fo + "  " + lo);



    }
}
