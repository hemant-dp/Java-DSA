public class DecimalToBinary {

    public static void main(String[] args) {
        decimaltobinary(5);
        decimaltoAnybase(10,2);
    }

    static void decimaltobinary(int decimalnum){
        int resNum=0;
        int power=0;
        while(decimalnum>0){
            int rem=decimalnum%2;
            decimalnum/=2;
            resNum += rem * Math.pow(10,power);
            power++;
        }
        System.out.println("Decimal to binary : " + resNum);
    }
    static void decimaltoAnybase(int decimalnum, int base) {
        int resNum = 0;
        int power = 0;
        while (decimalnum > 0) {
            int rem = decimalnum % base;
            decimalnum /= base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Decimal to Base : " + resNum);
    }
}
