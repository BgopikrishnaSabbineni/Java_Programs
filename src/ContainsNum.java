import java.util.*;

public class ContainsNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9};
            boolean b=false;
            for(int i:arr){
                if(i==num){
                    b=true;

                }

            }if(b){
            System.out.println(+num+" is there");
        }else{
            System.out.println(+num+" is not there");
        }
    }

}
