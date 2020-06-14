import java.util.Scanner;

public class Rectangle {
 public  static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Length");
     double length = s.nextDouble();
     System.out.println("Enter breath");
     double breath = s.nextDouble();
     double perimeter = 2 * (length + breath);
     System.out.println("Perimeter of rectangle is: " + perimeter);
 }


        }