import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        //int num = s.nextInt();
       /* int n = num%10;
        if((n == 0 ) ||(n == 5)){
            System.out.println("divisible by 5");
        }else{
            System.out.println("not divisible by 5");
        }*/
        int[] a = {3,4,5,10,15};
        for(int l: a){
            if ((l%5==0)){
                System.out.println(l+" "+"divisible by 5");
            }else{
                System.out.println(l+" "+"not divisible by 5");

            }
        }
    }
}
