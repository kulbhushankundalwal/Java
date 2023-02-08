
public class Rec8_LastOccurance {
    public static int LastOccurance(int arr[], int i, int key) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return LastOccurance(arr, i-1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 60, 4, 5, 60, 86 };
        System.out.println(LastOccurance(arr, arr.length-1, 60));
    }
}
