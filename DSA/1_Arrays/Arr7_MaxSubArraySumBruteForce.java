// Time Complexity = O(n^3)

public class Arr7_MaxSubArraySumBruteForce {
    public static int MaxSumSA(int arr[]){
        int MaxSum = Integer.MIN_VALUE;

        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int current=0;
                for(int k=i; k<=j; k++){
                    current+=arr[k];
                }
                System.out.println("Current Sum: " + current);
                if(current>MaxSum){
                    MaxSum=current;
                }
            }
        }
        System.out.println("Max Sum: " +MaxSum);
        return MaxSum;
    }
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        MaxSumSA(arr);
    }
}