import java.util.Scanner;

public class ConNumToMon {
    public static void main(String[] args) {
        String[] months={"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any month number");
        int n=s.nextInt();
        for(String i:months) {
            System.out.println(months[n - 1]);
            break;
        }

    }

}
