
public class DnC3_Search {
    public static int search(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            // case a
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            // case b
            else{
                return search(arr, tar, mid +1 , ei);
            }
        }

        // mid on L2
        else{
            // case c 
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid +1 , ei);
            }
            // case d 
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,5,7,8,0,1,2};
        int tar = 0;
        System.out.println(search(arr, tar, 0, arr.length-1));
    }
}
