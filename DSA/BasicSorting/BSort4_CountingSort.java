package DSA.BasicSorting;

public class BSort4_CountingSort {

    public static void sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j]=i;
                j++;
                count[i]--;
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
        int arr[]={2, 2, 8, 1, 5, 5, 2};
        System.out.print("Before Sorting, Array is: ");
        printarr(arr);
        System.out.print("After Sorting, Array is: ");
        sort(arr);
        printarr(arr);
    }
}