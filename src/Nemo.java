import java.util.Scanner;

public class Nemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ant String: ");
        String str=s.nextLine();
         if(str.contains("nemo")){
             System.out.println(4);
         } else{
             System.out.println("nemo is not there");
         }
    }
}
