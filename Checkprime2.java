public class Checkprime2 {
public static boolean Prime(int n){
  boolean isprime =true;
  for(int i=2;i<=n-1;i++){
    if(n % i==0){
        // isprime= false;
        return false;
    }

  }
return isprime;
}   
public static void main(String[] args) {
    System.out.println(Prime(6));
}  
}
