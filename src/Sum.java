import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = s.nextInt();
        System.out.println("Enter second Number: ");
        int b=s.nextInt();
        int sum = a+b;
        System.out.println("The sum is : "+sum);


    }
}
