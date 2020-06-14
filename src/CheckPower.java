import java.util.Scanner;

public class CheckPower {
    public static boolean pow(int n1,int n2){
         boolean b= false;
         int x;
         if(n1>0 && n2>0){
        for(int i=n2;i<n1;i*=n2) {
            x = n2 * i;
            if (n1 == x) {
                b = true;

            }else{
                b=false;
            }
        }
        }return b;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num1 = s.nextInt();
        System.out.println("Enter any number: ");
        int num2 = s.nextInt();
       System.out.println(pow(num1,num2));
       /* if(num1>0 && num2>0) {
            if (num1 % num2 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        } else if(num2==0){
            System.out.println("true");
        }*/
      /*  for (int i = num2; i <= num1; i *= num2) {
            int x = num2 * i;
            boolean b = (num1 == x);
            boolean d = false;
            if (b) {
                System.out.println(d = true);
            } 

        } */
    }



}