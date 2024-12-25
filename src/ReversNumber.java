public class ReversNumber {
    static void reverNum(int number){
        int result=0;
        while(number>0){
            int rem=number%10;
            result=result*10+rem;
            number/=10;
        }
        System.out.println("Reverse Number : "+ result);
    }
    public static void main(String[] args) {
        reverNum(23456);
    }
}
