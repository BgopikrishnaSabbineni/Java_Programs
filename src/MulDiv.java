import java.util.Scanner;

public class MulDiv {
    //14.	Multi-division. Write a function that takes a, b, c as parameters then add a to itself b times,
    // .. and see if the new number is divisible by c
    public static boolean div(int a,int b, int c){
        boolean f = false;
        int sum=0;
        for(int i=1;i<=b;i++){
            sum= a+a;
        }

        if(sum % c ==0){
            return  f=true;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter any number");
        int a=s.nextInt();
        System.out.println(" Enter any number");
        int b=s.nextInt();
        System.out.println(" Enter any number");
        int c=s.nextInt();
        System.out.print("result:");
        System.out.println();
        System.out.println(div(a,b,c));


    }
}
