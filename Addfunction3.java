import java.util.Scanner;

public class Addfunction3 {

         public static int Add(int a , int b){ //parameters or formal parameters
       
        int sum =a+b;
        return sum;
       
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int add = Add(a,b);// arguments or actual parameters
    System.out.println(add);
    
}  
}
