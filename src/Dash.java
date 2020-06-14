import java.util.Scanner;

public class Dash {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num=s.nextInt();
        String convt = "";
        for(int i = 1; i <= num; i++){
                convt+="-";
        }
        System.out.println(convt);
    }
}
