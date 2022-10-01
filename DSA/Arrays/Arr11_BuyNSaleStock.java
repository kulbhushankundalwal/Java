// Time Complexity = O(n)

package DSA.Arrays;

public class Arr11_BuyNSaleStock {

    public static int MaxPro(int price[]){
        int maxPro=0, buyPrice=Integer.MAX_VALUE;

        for(int i=0; i<price.length; i++){
            if(price[i]>buyPrice){ //profit
                int profit = price[i]-buyPrice; //today's profit
                maxPro=Math.max(profit, maxPro);
            }
            else{
                buyPrice=price[i];
            }
          
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int price[]={3, 7, 2, 8, 1, 5, 8, 9, 3};
        System.out.println("Max Profit = " + MaxPro(price));
    }
}
