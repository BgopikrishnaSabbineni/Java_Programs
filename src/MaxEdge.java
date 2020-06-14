import java.util.Scanner;

public class MaxEdge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double s1,s2,s3;
        System.out.println("Enter Side1: ");
        s1=s.nextDouble();
        System.out.println("Enter Side2: ");
        s2=s.nextDouble();
        System.out.println("Enter Side3: ");
        s3=s.nextDouble();
        if (s1+s2<s3 ){
            System.out.println("s3 is maximum edge");
        }
        else if(s2+s3<s1) {
            System.out.println("s1 is maximum edge:");
        }
        else{
            System.out.println("S2 is large");
        }

    }
}

