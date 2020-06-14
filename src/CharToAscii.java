import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any Character: ");
        //1st method
       /* char c = 'a';
        int i = c;
        System.out.println(i);
        //2nd method add cast explicitly
        int j = (int) c;
        System.out.println(j); */
        // 3rd method
        String str = s.nextLine();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
          int ascii = c;
            System.out.println(ascii);
        }
        


    }
}
