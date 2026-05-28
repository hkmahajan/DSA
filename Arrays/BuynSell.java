package Arrays;

public class BuynSell {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int buy;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(buy<prices[j]){
                    profit=Math.max(prices[j]-buy,profit);
                }
            }
        }
        System.out.println(profit);

    }
}
