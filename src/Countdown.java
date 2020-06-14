import java.lang.reflect.Array;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter any number: ");
        int n=s.nextInt();
        int[] arr=new int[n+1];
            if(n>0){
                for(int i=n;i>=0;i--){
                    System.out.print(arr[i]=i);

                }
               // System.out.println(arr);

            }else {
                System.out.println(0);
            }
    }
}
