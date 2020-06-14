public class IdChar {
    public static void main(String[] args) {
        String str = "gopii";
        System.out.println(check(str));

    }
    public static Boolean check(CharSequence str){
                boolean b=true;
        for (int i = 0; i <= str.length(); i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }return true;
    }
}
