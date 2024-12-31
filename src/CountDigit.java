public class CountDigit {
    public static void main(String[] args) {
        countValue(23456789);
    }
    static public void countValue(int number){
        if(number==0){
            System.out.println("Digits are : 1");
        }
        int count=0;
        while(number>0){
            number/=10;
            count++;
        }
        System.out.println("Digits are: "+count);
    }
}
