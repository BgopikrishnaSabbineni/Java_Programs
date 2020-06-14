import java.sql.SQLOutput;
import java.util.*;

public class Determinent {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       System.out.println("enter size of array: ");
        int n=s.nextInt();
        int[][] x=new int[n][n];
        System.out.println(" enter "+(n *n) +" elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(x[i][j]+" ");

            } System.out.println();
        }

     //  int[][] xy= {{11,1},{2,1}};
        double det = x[0][0] * x[1][1]  - x[1][0] * x[0][1];
        System.out.println(det);





        }

}
