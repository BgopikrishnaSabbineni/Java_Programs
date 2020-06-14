import java.util.Scanner;

public class LessZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = s.nextInt();
        if(n<=0){
            System.out.println("Number is less than or equal to zero");
            } else{
            System.out.println("Number is > 0");
        }



    }
}
