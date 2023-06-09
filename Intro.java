import java.util.*;
public class Intro{
    
 public static void main(String[] args) {
    // int[] arr ;   // declarartion 

    // arr=new int[5];  // intialization 

    // int[] arr2 = new int[5];
    // int[] arr = {1,2,3,4,5};

   //System.out.println(arr[0]);// access a element 

    // change a element in array 

    //arr[0]=100;

    //System.out.println(arr[0]);

    // length of a array 
//   int length = arr.length;

//   System.out.println(length);

//    for(int i = 0; i<arr.length ;i++){   //iterate and printing a array 
//      System.out.println(arr[i]);
//    }

// max in an array 
// int[] arr = {-23,-1,-67,-45,-34,-89,-100,-223,-45};

//     int max=Integer.MIN_VALUE;

//     for(int i =0;i<arr.length;i++){
//         if(max<arr[i]){
//             max=arr[i];
//         }
//     }

//     System.out.println(max);

// minimum in an array 

int[] arr = {23,1,67,45,34,89,100,223,45};

    // int min=Integer.MAX_VALUE;

    // for(int i =0;i<arr.length;i++){
    //     if(min>arr[i]){
    //         min=arr[i];
    //     }
    // }

    // System.out.println(min);
// sorting an array 
    Arrays.sort(arr);

    for(int i =0 ;i<arr.length;i++){
        System.out.println(arr[i]);
    }

 

 }
}