// Time Complexity = O(n^2)

package DSA.Arrays;

public class Arr5_PrintAllPossiblePairs {

    public static void pairs(int arr[]){
        int total=0;
        for(int i=0; i<arr.length; i++){
            int n= arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + n + ", " + arr[j] + ") ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + total);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 8, 6, 5};
        System.out.println("All possible pairs are: ");
        pairs(arr);
    }    
}