public class AbsSum {
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.abs(arr[i]);
        }
        return sum;

    }

   public static void main(String[] args)  {
        int[] s={2, -1, 4, 8, 10};
        System.out.println(sum(s));
    }
}
