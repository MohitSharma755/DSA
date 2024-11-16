public class Dectobinary {
    public static void Dectobinary(int n){
        int mynumber =n;
        int pow = 0;
        int binNum=0;
        while(n>0){
            int rem= n%2; // Here we are getting remonder
            binNum = binNum+(rem*(int)Math.pow(10, pow)); // In this line we are getting binary number
            pow++;
            n= n/2; // Here we are getting cosents 
        }
        System.out.println("Binary form of "+mynumber+" = "+binNum);

    }
    public static void main(String[] args) {
        Dectobinary(7);
        
    }
    
}
