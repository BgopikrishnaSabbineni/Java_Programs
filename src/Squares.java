import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any num");
        int n = s.nextInt();
       int  square= n * n;
        System.out.println("square of "+n+" is: "+square);
    }
}

