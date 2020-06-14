import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        String s1= "gopi krishna";
        String s2="sabbineni";
        int count=0;
        int count1=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!= ' ')
                count++;
        }

        System.out.println(count);

        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i) != ' ')
                count1++;
        }

        System.out.println(count1);

        if(count>count1){
            System.out.println("String S1 have more characters");
        } else{
            System.out.println("String S2 have more characters");
        }

            char[] ch=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            for(int i=0;i<ch.length;i++){
                ch[i]=ch[i];
            }
        System.out.println(ch.length);
        for(int i=0;i<ch2.length;i++){
            ch2[i]=ch2[i];
        }
        System.out.println(ch2.length);

            if(ch.length > ch2.length){
                System.out.println("s1 have more");
            }else{
                System.out.println("s2 have more");
            }




    }
}
