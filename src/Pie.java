import java.util.Scanner;

public class Pie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Total Number of Slices: ");
        int t=s.nextInt();
        System.out.println("Enter Number of people: ");
        int p=s.nextInt();
        System.out.println("Enter Number of Slices for each person: ");
        int n=s.nextInt();
        if(((n * p) < t) ||((n * p) == t)){
            System.out.println("Fairly distributed");
        }else{
            System.out.println(" Not possible to distribute fairly");
        }
            }
}
