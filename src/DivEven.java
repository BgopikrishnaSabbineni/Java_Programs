public class DivEven {
    // 16.	Divides evenly. Given two numbers a and b, return true if a can be divided by
    // evenly otherwise false.
    // dividesEvenly(98,7) = true, dividesEvenly(85,4) = false
    public static boolean div(int a,int b){
       boolean f=false;
        if(a%2 ==0){
            return f=true;
        }
        return f;

    }

    public static void main(String[] args) {
        System.out.println(div(98,7));
        System.out.println(div(85,5));
    }
}

