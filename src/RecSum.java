public class RecSum {
    public static int recSum(int n){
        if(n<=1){
            return n;
        }else {
            return n + recSum(n-1);
        }
    }

    public static void main(String[] args) {
       int n=5;
       int sum=0;
        System.out.println(recSum(5));
        /*for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);*/

    }
}

