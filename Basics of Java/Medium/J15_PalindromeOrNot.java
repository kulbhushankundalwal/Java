import java.util.*;

public class J15_PalindromeOrNot {
    public static void Pal(int num){
        int OrgNum = num;
        int rev = 0;
        while(num>0){
            rev = (rev*10) + (num%10);
            num/=10;
        }
        if(OrgNum==rev){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Pal(num);
    }
    
}
