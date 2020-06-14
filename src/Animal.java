import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number of Chickens");
        int ch = s.nextInt();
        System.out.println("Enter Number of Cows");
        int co = s.nextInt();
        System.out.println("Enter Number of pigs");
        int p = s.nextInt();
        int chicken = ch * 2;
        int cow= co * 4;
        int pig = p * 4;
        System.out.println("Total Number of legs: "+(chicken+cow+pig));
    }
}
