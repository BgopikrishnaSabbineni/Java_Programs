import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int num1=s.nextInt();
        System.out.println("Enter Number2: ");
        int num2=s.nextInt();
        
        int num3= num1%num2;
        System.out.println(num3);

    }
}
