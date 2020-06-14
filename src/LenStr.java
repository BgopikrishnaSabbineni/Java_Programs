public class LenStr {
    public static void main(String[] args) {
        String str= "Bala Gopi Krishna Sabbineni";
        int count=0;
        System.out.println(str.length());
        System.out.println(str.replace(" ","").length());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }

        }
        System.out.println(count);


    }
    }

