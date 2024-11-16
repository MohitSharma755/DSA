import java.util.Scanner;

public class Casting {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a= 12.12f; //In this line we are doing losy conversion
    int b= (int) a;
    System.out.println(b);
}    
}
