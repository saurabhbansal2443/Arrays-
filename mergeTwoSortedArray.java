import java.util.*;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {3,5,7,9,10,15,16,17};
        int[] arr2 = {1,4,5,6,7,8};

        int[] res = new int[arr1.length + arr2.length];


        int p1 = 0 ;
        int p2 = 0 ;
        int p3 = 0 ;

        while(p3<res.length){
            int val1 = p1<arr1.length ? arr1[p1]:Integer.MAX_VALUE; // true : false 
             int val2 = p2<arr2.length ? arr2[p2]:Integer.MAX_VALUE;

             if(val1<val2){
                res[p3]=val1;
                p3++;
                p1++;
             }else{
                res[p3]=val2;
                p3++;
                p2++;
             }
        }
        System.out.println(Arrays.toString(res));
        
        
    }
}
