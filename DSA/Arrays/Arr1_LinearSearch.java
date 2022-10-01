// Time Complexity = O(n)

package DSA.Arrays;
import java.util.*;

public class Arr1_LinearSearch {

    public static int LinearSearch(int arry[], int key){
        for(int i=0; i<arry.length; i++){
            if(arry[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {12, 3, 20, 2, 34, 29};
        System.out.print("Enter element to be searched: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        if(LinearSearch(nums, key) == -1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element is found at index: " + LinearSearch(nums, key));
        }
    }
}