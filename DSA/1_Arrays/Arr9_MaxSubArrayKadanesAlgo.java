// Time Complexity = O(n)

public class Arr9_MaxSubArrayKadanesAlgo {
    public static int Kadanes(int arr[]){
        int max=Integer.MIN_VALUE, cs=0;
        for(int i=0; i<arr.length; i++){
            cs+=arr[i];
            max=Math.max(cs,max);
            if(cs<0){
                cs=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {23, 1, -1, 23, -45, 12, -12};
        System.out.println("The Sum is "+ Kadanes(arr));
    }
}
