import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        a = s.nextInt();
        System.out.println("Enter any number");
        b = s.nextInt();

        if (a == b) {
            System.out.println(!(a==b));

        }

    }
}
