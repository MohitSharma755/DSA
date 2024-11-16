public class Ternary {
public static void main(String[] args) {
    int a =10;
    int b =20;
    String ternary =((a%2)==0)?"even":"odd";
    System.out.println(ternary);
    //Another program
    String greater = ((a>b))?"A is greater":"B Is greater"; 
    System.out.println(greater);

    int marks =67;
    String report = marks >=33 ?"Pass":"Fail";
    System.out.println(report);
}    
}
