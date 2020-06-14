import java.util.Scanner;

public class MintoSec {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int minute=s.nextInt();
        int seconds= minute * 60;
        System.out.println(+minute+ " minutes in seconds: "+seconds);

    }
}
