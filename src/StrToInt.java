import java.util.Scanner;

public class StrToInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any String in number format: ");
        String str = s.nextLine();
        // String to Integer
        int i = Integer.parseInt(str);
        Integer int2 = Integer.valueOf(str);
        System.out.println(i+int2);
        // Integer to String
        String str1 = Integer.toString(i);
        String str2 = String.valueOf(i);
        System.out.println(str1+str2);

    }
}
