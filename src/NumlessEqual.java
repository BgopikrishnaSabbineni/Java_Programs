import java.util.Scanner;

public class NumlessEqual {
    public static boolean less(int n){
        boolean b=false;
        if (n<0){
            System.out.println("less than zero");
                //return b=true;
        }else if(n==0){
            System.out.println("equal to zero");
            //return b=!b;
            return b=true;
        }
        System.out.println("greater than zero");
        return b;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=s.nextInt();
        System.out.println(less(n));
    }
}
