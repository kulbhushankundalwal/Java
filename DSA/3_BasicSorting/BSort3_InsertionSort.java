// Time Complexity = O(n^2)

package DSA.BasicSorting;

public class BSort3_InsertionSort {

    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            //finding correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 8, 1, 5, 9, 6};
        System.out.print("Before Sorting, Array is: ");
        printarr(arr);
        System.out.print("After Sorting, Array is: ");
        sort(arr);
        printarr(arr);
    }
}