public class Largestnumber {
    public static int getlargest(int numbers[]){
        int largest = numbers[0];
        int smallest = numbers[0];
        // int number = a[i];
        for(int i = 0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is"+smallest);
        return largest;
        // return smallest;

    }
    public static void main(String[] args) {
     int numbers[] = {1,2,4,3,5,7,66,8,0,9,-1};
     int large =  getlargest(numbers);
     System.out.println("Large number is "+large);
        
    
    
}
}
