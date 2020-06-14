public class ArrayMult {
    public static void main(String[] args) {
        int[] arr = numbers();


        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr[i] * arr.length;
            System.out.print(arr[i] + " ");

        }


    }

    public static int[] numbers() {
        int[] result = {1, 2, 3, 4};
        return result;
    }
}
