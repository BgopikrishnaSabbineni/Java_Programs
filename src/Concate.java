import java.util.Scanner;

public class Concate {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.println("Enter any String");
        String str1 = s.nextLine();
        System.out.println("Enter any String");
        String str2 = s.nextLine();*/
        String s1="Gopi Krishna Sabbineni";
        String[] s3 = s1.split(" ");
        String s2= s1.substring(0,4)+s1.substring(12);

            System.out.println(s3[0]+" "+s3[2]);
            


    }
}
