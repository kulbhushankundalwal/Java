// Time Complexity = O(n)

package DSA.Arrays;

public class Arr2_FindLargestNum {

    public static int LargVal(int arr[]){
        int larg = Integer.MIN_VALUE; // (- infinity)
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        return larg;
    }
    public static void main(String[] args) {
        int nums[] = {12, 3, 20, 2, 34, 29};
        System.out.print("Largest value is: " + LargVal(nums));
    }
}
