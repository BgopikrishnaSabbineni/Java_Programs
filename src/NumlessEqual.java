import java.util.Scanner;

public class less {
    public static boolean less(int n){
        boolean b=false;
        if (n<=0){
            return b=true;

        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=s.nextInt();
        System.out.println(less(n));
    }
}
