public class RevCapt {
public static String rev(String str){
    String upper=str.toUpperCase();
    String s="";
    char[] ch=upper.toCharArray();
    for(int i=upper.length()-1;i>=0;i--){

        s+=upper.charAt(i);
    }

    return s;
}

    public static void main(String[] args) {
        String strr="gopi krishna";
        System.out.println(rev(strr));
    }
}
