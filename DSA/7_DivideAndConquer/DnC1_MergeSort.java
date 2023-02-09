// Time Complexity in all cases is O(nlogn)
// Spcae Complexity is O(n)
// Depth First

public class DnC1_MergeSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // or (si+ei)/2

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of left sorted array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover elements of right sorted array
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 9, 2, 4, 0 };
        System.out.print("Before sort: ");
        print(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.print("After sort: ");
        print(arr);
    }
}
