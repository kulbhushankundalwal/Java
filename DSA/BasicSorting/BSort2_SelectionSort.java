// Time Complexity = O(n^2)

package DSA.BasicSorting;

public class BSort2_SelectionSort {
    
    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){  //if(arr[minPos]<arr[j]) for dec order
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
