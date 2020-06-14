import java.util.Scanner;

public class CaseCom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str1=s.nextLine();
        System.out.println("Enter any String: ");
        String str2=s.nextLine();
        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println(result);
    }
}
