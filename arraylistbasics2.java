import java.util.*;

public class arraylistbasics2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add 
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1,100);

        //remove from an index 

        list.remove(1);

        // get 

        int ele = list.get(2);

        // set an element 
        

        list.set(1,100);

        // size 
        int l = list.size();

        // clear 

        //list.clear();

        // contains 
       System.out.println(list.contains(100));
        

        System.out.println(list);
        System.out.println(list.toArray());
    }

    
}
