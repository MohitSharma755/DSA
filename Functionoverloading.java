public class Functionoverloading {
public static int sum(int a,int b){
    return a+b;
} 
//here we are doing fnction overloading . because we are using same name functions here.
public static int sum(int a,int b,int c){
    return a+b+c;
}    
public static void main(String[] args) {
   System.out.println(sum(55,44 )); 
    System.out.println(sum(55,44 ,4));
};
}
