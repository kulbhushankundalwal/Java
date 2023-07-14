// Time Complexity = O(n^2)


public class Arr8_MaxSubArrayPrefixSum {
    public static int MaxSumSA(int arr[]){
        int MaxSum = Integer.MIN_VALUE, prefix[]=new int[arr.length];
        
        //Calculate Prefix Array
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int current=prefix[j]-prefix[i];
            
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
