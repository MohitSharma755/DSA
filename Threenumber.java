import java.util.Scanner;

public class Threenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt(); 
        int b =sc.nextInt(); 
        int c =sc.nextInt(); 
        if(a>b &&a>c){
            System.out.println("This is greater number"+a);
        }
else if(b>c){
    System.out.println("This is greater number"+b);
}
else{
    System.out.println("This is greater number"+c);

}
    }
}
