// Time Complexity = O(n)

package DSA.Arrays;

public class Arr4_ReverseString {

    public static void reverse(int arr[]){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 14, 45, 57, 78};
        System.out.print("Before reverse, array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverse(arr);

        System.out.print("After reverse, array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}