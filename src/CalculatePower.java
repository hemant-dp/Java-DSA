public class CalculatePower {
    static double powerCal(int num,int pow){
        int resNum=1;
        for(int i=0;i<pow;i++){
            resNum=resNum*num;
        }
        return resNum;
    }
    public static void main(String[] args) {
        double value = powerCal(10,2);
        System.out.println(value);
    }
}
