public class Digits {
    //Number of digits in a given number. noOfDigits(7154) = 4, noOfDigits(56) = 2
    public static void main(String[] args) {
        int i=10;
        int count=0;
        while(i != 0){
            i /=10;
            count++;
        }
        System.out.println(count);
    }
}
