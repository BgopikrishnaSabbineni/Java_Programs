public class Comp {
    public static boolean comp(String[] arr){
        boolean b= false;
       String sml=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals(sml)){
                arr[i]=sml;
            } else {
                return b;
            }
        }
        return b=true;
    }

    public static void main(String[] args) {
        String[] s = {"abc", "abc", "abc", "abc"};

        System.out.println(comp(s));

    }

    }

