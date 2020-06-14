import java.util.Scanner;

public class Arthmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter any number:");
        double d1=s.nextDouble();
        System.out.println(" Enter any number:");
        double d2=s.nextDouble();
        double add = d1 + d2;
        double subtract = d1 - d2;
        double multiply = d1*d2;
        double divide = d1 / d2;
        System.out.println("addtion: "+add+"\t substraction: "+subtract+"\t multiply: "+multiply+"\t divison: "+divide);
    }
}
