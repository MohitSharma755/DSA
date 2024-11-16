public class Binomial {

    public static int Factorial(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;

      }
      return f;
    }
public static int biocoffe(int n,int r){
    int fact_n= Factorial(n);
    int fact_r= Factorial(r);
    int factnmr= Factorial(n-r);
    int biocoffee = fact_n/(fact_r*factnmr);
    return biocoffee;
}    
public static void main(String[] args) {
    System.out.println(biocoffe(5,2));
}
}
