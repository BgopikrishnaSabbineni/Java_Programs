import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Height: ");
        double h = s.nextDouble();
        System.out.println("Enter breath: ");
        double b = s.nextDouble();
        double area = (b*h)/2;
        System.out.println("Area of Triangle: "+area);
    }
}
