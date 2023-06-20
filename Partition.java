import java.util.*;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {-3,-4,2,-1,-6,0,7,9,5,8};

        int k =0;


        // 1st Approach using new Array

        // int[] res = new int[arr.length];

        // int idx = 0;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=k){
        //         res[idx]=arr[i];
        //         idx++;
        //     }
        // }

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>k){
        //         res[idx]=arr[i];
        //         idx++;
        //     }
        // }

        // System.out.println(Arrays.toString(res));

        //2nd Approach 

        // ArrayList<Integer> greater= new ArrayList<>();
        // ArrayList<Integer> lesser= new ArrayList<>();


        // for(int i=0;i<arr.length;i++){
        //     if( arr[i]<=k){
        //         lesser.add(arr[i]);
        //     }else{
        //         greater.add(arr[i]);
        //     }
        // }

        // int idx = 0;
        // for(int i=0;i<lesser.size();i++){
        //     arr[idx]=lesser.get(i);
        //     idx++;
        // }

        // for(int i=0;i<greater.size();i++){
        //     arr[idx]=greater.get(i);
        //     idx++;
        // }

        // System.out.println(Arrays.toString(arr));

        // 3rd appraoch using Two pointer 


        // int lo = 0;
        // int hi = 0;

        // while( hi != arr.length){

        //     if(arr[hi]>k){
        //         hi++;
        //     }else{
        //         int temp = arr[lo];
        //         arr[lo]= arr[hi];
        //         arr[hi]= temp;
        //         hi++;
        //         lo++;

        //     }
        // }

        // System.out.println(Arrays.toString(arr));

        // 4th approach using high at end and low at start 

        int lo = 0;
        int hi = arr.length-1;

        while( lo < hi){
            if( arr[lo]<=k){
                lo++;
            }else if ( arr[hi]>k){
                hi--;
            }else{
                int temp = arr[lo];
                arr[lo]=arr[hi];
                arr[hi]= temp;
                lo++;
                hi--;
            }
        }

        System.out.println(lo);

        System.out.println(Arrays.toString(arr));



    }
}
