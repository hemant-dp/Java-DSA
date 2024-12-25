public class BinaryToDecimal {
    public static void main(String[] args) {
        binarytodecimal(101);
        binarytoAnybase(101,2);
    }
   static void binarytodecimal(int binaryNum){
        int resNum=0;
        int power=0;
        while(binaryNum>0){
            int unitdigit=binaryNum%10;
            binaryNum/=10;
            resNum += unitdigit*Math.pow(2,power);
            power++;
        }
       System.out.println("binary to decimal : "+resNum);
    }
    static void binarytoAnybase(int binaryNum, int base){
        int resNum=0;
        int power=0;
        while(binaryNum>0){
            int unitdigit=binaryNum%10;
            binaryNum/=10;
            resNum += unitdigit*Math.pow(base,power);
            power++;
        }
        System.out.println("binary to base : "+resNum);
    }
}
