import java.util.Scanner;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter First Angle: ");
        double x=s.nextDouble();
        System.out.println("Enter Second Angle: ");
        double y=s.nextDouble();
      /*  x=Math.toDegrees(x);
        y=Math.toDegrees(y); */
        double ThirdAngle= 180-(x+y);
        System.out.println(Math.abs(ThirdAngle));
    }
}
