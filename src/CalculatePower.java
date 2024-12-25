public class CalculatePower {
    static void powerCal(int num,int pow){
        int resNum=1;
        for(int i=0;i<pow;i++){
            resNum=resNum*num;
        }
        System.out.println(resNum);
    }
    public static void main(String[] args) {
        powerCal(10,2);
    }
}
