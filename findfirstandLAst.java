public class findfirstandLAst {
    public static void main(String[] args) {
        int[] arr = {34,67,56,45,45,45,89,90};

        int k = 45 ;

        int fi = -1 ;
        int li = -1 ;
        int count = 0 ;

        for(int i=0;i<arr.length;i++){

            if(k==arr[i]){
                count++;
              
            }
        }
        System.out.println(count);

        // for(int i=arr.length-1;i>=0;i--){

        //     if(k==arr[i]){
        //         li=i;
              
        //     }
        // }

        boolean flag = true ;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==k && flag == true ){
                fi = i ;
                li = i ;
                flag = false ;
            }else if ( arr[i]==k){
                li = i ;
            }
        }

        //System.out.println(fi + "   " + li);
    }
}
