import java.util.Scanner;

public class StrEmpty {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter any String");
        String str = s.nextLine();
        System.out.println("Enter any String");
        String str2 = s.nextLine();
            if(str == ""){
                System.out.println("String not empty");
            }else{
                System.out.println("empty");
            }
                System.out.println(str.isEmpty()  );

    }
}
