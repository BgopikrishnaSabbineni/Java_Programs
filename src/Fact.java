import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.println(fact);

    }
}
