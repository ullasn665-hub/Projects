package day12;

public class maxProfit {

    static int MaxProfit(int[] arr) {

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }

            int profit = arr[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(MaxProfit(arr));
    }
}
