public class MinRm {
    public static int min(int[] arr) {
        int count = 0;
        int l=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
             if (count % 2 == 0) {
                return 0;
            } else{
                return l;
            }


        } return l;


    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5};
        System.out.println(min(a));
    }
}
