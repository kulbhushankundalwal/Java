// Time Complexity = O(log n)

import java.util.*;

public class Arr3_BinarySeach {

    public static int BinarySearch(int arr[], int key){
        int start = 0, end = arr.length-1; 
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {12, 45, 65, 71, 74, 89};
        System.out.print("Enter element to be searched: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        if(BinarySearch(nums, key) == -1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element is found at index: " + BinarySearch(nums, key));
        }
    }
}
