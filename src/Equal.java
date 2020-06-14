import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ANy Number: ");
        Integer n1 = s.nextInt();
        System.out.println("Enter ANy Number: ");
        Integer n2 = s.nextInt();
        boolean b = n1.equals(n2);
        //System.out.println(n1.equals(n2));
        if(b){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
