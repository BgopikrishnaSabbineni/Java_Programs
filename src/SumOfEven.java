import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n1=s.nextInt();
        System.out.println("Enter any Number:");
        int n2 =s.nextInt();
        int sum=0;

        if(n1 % 2 ==0 || n2 % 2 ==0) {
            if (n1 % 2 == 0 && n2 % 2 == 1) {
                for (int i = n1; i < n2; i += 2) {
                    sum += i;
                }
                System.out.println(sum);
            }


            if (n1 % 2 == 0 && n2 % 2 == 0) {
                for (int i = n1; i <= n2; i += 2) {
                    sum += i;
                }
                System.out.println(sum);
            }
        }

//________________________________________________________________________________________________

           else if(((n1 % 2) == 1) || ((n2 % 2) == 1)){
                for (int i = n1 + 1; i < n2; i += 2) {
                    sum += i;
                }
                System.out.println(sum);
        } if(((n1 % 2) == 1) && ((n2 % 2) == 0)){

            for (int i = n1 + 1; i <= n2; i += 2) {
                sum += i;

            }
            System.out.println(sum);
        }

    }
}
