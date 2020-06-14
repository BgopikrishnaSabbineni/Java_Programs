import java.util.Scanner;


public class Greeting {
    public static  String add(String str){
        String s="Hello";
       // System.out.println(s+" "+str);
        return s+" "+str;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ");
        String l=s.nextLine();
        //String name = "Steve";
        //String add = "Hello";
        //System.out.println(add+" "+ name);
        //String g = name.i;
        System.out.println(add(l));

    }
}
