public class Callbyvalue {
    public static void Swap(int a,int b){
        a =10;
      b =20;
        int temp;
        temp =a;
        a=b;
        b=temp;
        
    }
public static void main(String[] args) {
    int a =10 ;
    int b =20;
    Swap(a,b);
    // In java all functions use call by value 
    System.out.println("The value of a is "+a);
    System.out.println("The value of b is "+b);

}    
}
