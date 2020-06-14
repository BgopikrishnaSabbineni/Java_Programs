import java.util.Scanner;

public class Factors {
    public static boolean factors(int[] factors, int n){
        boolean b=false;
        for(int i =0;i<factors.length;i++ ){
            if(n % factors[i]==0){
                b=true;
            }else{
                b=false;
            }
        }return b;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = {1,2,3,4};
        System.out.println(Factors.factors(arr,n));
        /*for(int i=1;i<arr.length;i++){
            if(n%arr[i]==0){
                System.out.println(arr[i]+" is a factor of "+n);
            }
        }*/


    }
}
