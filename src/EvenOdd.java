import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int i=s.nextInt();
        if(i % 3== 1){
            System.out.println(" odd Number");
        }else{
            System.out.println("even number");
        }
    }

}
