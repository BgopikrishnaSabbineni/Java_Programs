import java.lang.reflect.Array;
import java.util.Arrays;

public class Aditive {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] inv=new int[arr.length];
       // for(int i:arr)
        for(int i=0;i<arr.length;i++){
            inv[i]= arr[i] *(-1);
        }
            System.out.println(Arrays.toString(inv));
    }
}

