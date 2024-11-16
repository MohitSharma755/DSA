public class Array2 {

    public static void update(int number[]){
        for(int i= 0;i<number.length;i++){
            number[i]= number[i]+1;
            System.out.println(number[i]);

        }

    }
    public static void main(String[] args) {
        int number [ ]={1,2,3,4};
        update(number);
        
    }
}
