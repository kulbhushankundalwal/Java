import java.util.*;

public class J12_ContinousCharRightTraingle {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");   
        int n = sc.nextInt();

        char ch = 'A';

        //Number of lines
        for(int line=1; line<=n; line++){ 
            // Number of chars
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
