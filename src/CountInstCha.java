public class Count {
    public static void main(String[] args) {
        String str = "Gopiii";
        int count =0;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            count =0;
            for(int j=0;j<ch.length;j++){

                if(j < i && ch[i]==ch[j]){
                    break;
                }
                if(ch[i]==ch[j]){
                    count++;
                }
                if(j==ch.length-1){
                    System.out.println("count of letter "+ch[i]+ " is "+count);
                }
            }

        }

    }
}
