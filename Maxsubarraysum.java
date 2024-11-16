public class Maxsubarraysum {
    public static void maxsubsum(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum=0;
           
            for(int k=start;k<=end;k++){
                // SUbarray sum
                currSum+=numbers[k];

            }
            System.out.print(currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }

            System.out.println();
        }

          System.out.println();  
        }
        // return -1 ;
        System.out.println("maxSum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        maxsubsum(numbers);
    }
    
}
