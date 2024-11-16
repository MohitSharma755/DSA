import java.util.Scanner;

public class Primerange {
public static boolean isprime(int n){
for(int i=2;i<=Math.sqrt(n);i++){
    if(n % i==0){
        return false;
    }
}
return true;
}

public static void Prmierangeprint(int number){
    for(int i =2;i<=number;i++)
    if(isprime(i) ){
        System.out.println(i+" ");
    }
}
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    Prmierangeprint(n);
    
 }   
}
