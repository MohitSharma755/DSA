public class Checkprime {
    public static int Prime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){

                System.out.println(" not Prime");
                break;
            }
            else{
                System.out.println(" Prime");
                break;
    
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Prime(5);
    }
    
}
