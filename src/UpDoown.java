import java.util.Arrays;

public class UpDoown {
    public static int[] updown(int[] a){
      
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 1){
                a[i]+=1;
            }else{
                a[i]-=1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
      //  System.out.println(updown(a));

        System.out.println(Arrays.toString(updown(a)));
    }
}
