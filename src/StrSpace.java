import java.util.Scanner;

public class StrSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any String");
        String str =s.nextLine();
        int count=0;
        char[] ch=str.toCharArray();
        System.out.println(ch);
        for(char i:ch){
            if(i == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
