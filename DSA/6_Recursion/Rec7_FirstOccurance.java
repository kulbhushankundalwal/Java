
public class Rec7_FirstOccurance {
    public static int FirstOccurance(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccurance(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 60, 4, 5, 60, 86 };
        System.out.println(FirstOccurance(arr, 0, 60));
    }
}
