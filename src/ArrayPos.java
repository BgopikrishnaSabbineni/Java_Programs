import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayPos {
    public static int position(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }

        } return -1;


    }

    public static void main(String[] args) {
        int[] ar={11,2,3,4};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ant number");
        int  n=s.nextInt();
        System.out.println(ArrayPos.position(ar,n));
    }
}
