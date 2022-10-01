// package Medium;

// import java.util.*;

// public class J14_DecimalToBinaryConverter {
//     public static int DtoB(int dec){
//         int bin = 0;
//         int pow = 0;
//         while(dec>0){
//             int rem = dec%2;
//             bin = bin + (rem * (int)Math.pow(10, pow));
//             pow++;
//             bin = bin/2;
//         }
//         return bin;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Decimal number: ");
//         int dec = sc.nextInt();
//         System.out.println("The equivalent Binary is: " + DtoB(dec));
//     }
// }
