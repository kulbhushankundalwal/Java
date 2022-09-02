// Time Complexity = O(n^3)

package DSA.Arrays;

public class Arr6_PrintSubArrays {

    public static void SubArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 6, 5};
        System.out.println("All sub-arrays are: \n");
        SubArr(arr);
    }    
}