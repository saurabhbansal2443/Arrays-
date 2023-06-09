public class copy {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,6,4,8,0};

        int[] res = new int[arr.length];

        for(int i=0;i<arr.length;i++){   //copying 
            res[i]=arr[i];
        }

        for(int i=0;i<res.length;i++){   // printing 
            System.out.println(res[i]);
        }
    }
}
