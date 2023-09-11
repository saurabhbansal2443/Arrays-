import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 3, 4, 3, 5, 9 };

      ArrayList<Integer> sol = new ArrayList<>();

      for(int i=0;i<arr.length;i++){
        int ele = arr[i];

        sol.add(ele);
      }

        int ans = countEvenElements(sol);

        System.out.println(ans);

    }

    public static int countEvenElements(ArrayList<Integer> arr) {

        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            int ele = arr.get(i);

            if (ele % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (ans.contains(ele) == false) {
                ans.add(ele);
            }
        }

        return ans;
    }
}
