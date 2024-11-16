public class Binarysearch {
    public static int binarsearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            
            //comparison
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end =mid-1;
            }

        }
        return -1;
    }
public static void main(String[] args) {
    int numbers[] = {1,33,2,44,55,22,11,66};
    int key = 3;
    System.out.println("The key is :"+ binarsearch(numbers, key));
    
}    
}
