import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
       int[] arr ={1,2,3,4,1,1,8,2,2,3,43,4,5,6,7,2,2,3};

       ArrayList<Integer> res = new ArrayList<>();

       for(int i=0;i<arr.length;i++){
          int ele = arr[i];

          boolean flag = false;

          for(int j =0;j<res.size();j++){  // this loop is checking the presence of a element 
            int listElement = res.get(j);

             if(listElement==ele){ // if the element is present in arraylist it will mark flag as true 
                flag=true;
                break;
             }
          }

          if(flag == false){  // adding if the flag = false as element is not present 
            res.add(ele);
          }
       }

       System.out.println(res);

    }
}
