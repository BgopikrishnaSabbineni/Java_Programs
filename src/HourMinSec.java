import java.util.Scanner;

public class HourMinSec {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Hours: ");
        int h=s.nextInt();
        System.out.println("Enter minutes: ");
        int m1=s.nextInt();
        int s1= h*60;

        int m = h * 60;
        int s2= m1*60;
        System.out.println("Hours to minutes are: "+s1+" minutes to seconds: " +
                +s2);


    }
}
