import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter Any number: ");
        int num1 = s.nextInt();
        double num2= Math.pow(num1,num1);
        System.out.println(num2);

        int num3=num1;
        if(num1>0){
            for (int i = 1; i<num1; i++) {
                num3= num1 * num3;
            }
            System.out.println(num3);
        }
    }
}
