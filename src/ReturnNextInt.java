import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ant Integer: ");
        i=s.nextInt();
        int next  = i+1;

        System.out.println("Next Integer is : "+next);
    }
}

