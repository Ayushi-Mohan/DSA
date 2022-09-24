package find;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 2, 4};
        int maxProfit = stockBuyAndSell(arr);
        System.out.println(maxProfit);
    }

    private static int stockBuyAndSell(int[] arr) {
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int price_today: arr) {

            min_value = Math.min(min_value, price_today);

            max_profit = Math.max(max_profit, price_today - min_value);
        }

        return max_profit;
    }
}
