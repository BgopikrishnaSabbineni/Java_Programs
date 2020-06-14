import java.util.Arrays;

public class Rem {
    //19.	Divide and reminder of an array. Write a function to take array and number and
    // return the remainder of each division.
    // divide([5, 7, 8, 2, 1], 2) = [1, 1, 0, 0, 1]
    public static int[] div(int[] arr, int n){
                int[] j= new int[arr.length];
                for(int i=0;i<arr.length;i++){
                    j[i]=arr[i] % n;
                }
        return j;
    }

    public static void main(String[] args) {
        int[] i={5,7,8,2,1};
        System.out.println(Arrays.toString(div(i, 2)));
        
    }
}
