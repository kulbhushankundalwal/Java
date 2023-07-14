// Time Complexity = O(n^2)


public class BSort1_BubbleSort {

    public static void sort(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
