public class cubes {
    public static int cubes(int[] arr){
        int n=0;
        for(int j=0;j<arr.length;j++){
            n+=(arr[j] * arr[j] * arr[j] );
        }
        return n;
    }
    public static void main(String[] args) {
        int[] c={1,5,9};
        System.out.println(cubes(c));
    }
}
