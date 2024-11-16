public class Binary2decimal {

    public static void bintode(int binnum){
        int mynumber =binnum;
        int pow = 0;
        int Bin = 0;
        while (binnum>0){
            int lastdigit = binnum % 10;
            Bin = Bin +(lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum=binnum /10;

        }
        System.out.println("decimal of "+mynumber+"="+Bin);

    }
    public static void main(String[] args) {
        bintode(110);
        
    }
    
}
