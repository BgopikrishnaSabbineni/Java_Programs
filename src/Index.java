import java.util.Scanner;

public class Index {
//Find an index. Write a function that takes an array of strings,
// and a string as arguments and returns the index of the string.
// findIndex([“Blue”, “Green”, “Yellow”, “Red”], “Yellow”) = 2
public static void main(String[] args) {
    Scanner st=new Scanner(System.in);
    System.out.println("enter any color in array");
    String c=st.nextLine();
    String[] s= {"Blue", "Green","Yellow","Red"};
    for(int i=0;i<s.length;i++){
        if(s[i].equalsIgnoreCase(c)){
            System.out.println(i);
        }
    }
}
}
