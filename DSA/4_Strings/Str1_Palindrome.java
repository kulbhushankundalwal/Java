import java.util.Scanner;

public class Str1_Palindrome {

    public static boolean IsPal(String str){
        int n=str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(IsPal(str)){
            System.out.println("Given word is palindrome");
        }
        else{
            System.out.println("Given word is not palindrome");
        }
    }
}