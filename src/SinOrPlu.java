import java.util.Scanner;

public class SinOrPlu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str=s.nextLine();
        String st=str.substring(str.length()-2,str.length());
        String st1=str.substring(str.length()-1,str.length());
        System.out.println(st);
        if(st.equals("es") || st1.equals("s")){
            System.out.println("plural");
        }else{
            System.out.println("singular");
        }
    }
}
