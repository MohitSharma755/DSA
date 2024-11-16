import java.util.Scanner;

public class Linear {
    public static int linearsearch(int linear[], int key) {
               for (int i = 0; i < linear.length; i++) {
            if (linear[i] == key) {
             
                return i;
            }
        }
        return -1;
       
    }

    public static void main(String[] args) {
        int linear[] = { 22, 3, 4, 5, 66, 44, 33, 22, 11 };
        Scanner sc=new Scanner(System.in); 
        int key = sc.nextInt();
      int i=  linearsearch(linear, key);
        if(i==-1){
            System.out.println("Number not found");

        }
        else{
            System.out.println("key is at index"+i);
        }
    }

}
