public class findMissing {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };

        int ogSum = (n * (n + 1)) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int diff = ogSum - sum;

        System.out.println(diff);

    }
}

// gfg code for the same problem

// class Solution {
// int missingNumber(int[] arr, int n) {

// int ogSum = (n*(n+1))/2;

// int sum =0 ;

// for(int i =0;i<arr.length;i++){
// sum+=arr[i];
// }

// int diff = ogSum-sum;

// return diff;

// }
// }