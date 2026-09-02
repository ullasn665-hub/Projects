package Day10;
public class FractionalKnapsack {

    public static void main(String[] args) {

        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};

        int capacity = 50;

        double totalProfit = 0;

        for (int i = 0; i < weight.length - 1; i++) {

            for (int j = i + 1; j < weight.length; j++) {

                double r1 = (double) profit[i] / weight[i];
                double r2 = (double) profit[j] / weight[j];

                if (r1 < r2) {

                    int temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;
                }
            }
        }

        for (int i = 0; i < weight.length; i++) {

            if (capacity >= weight[i]) {

                capacity = capacity - weight[i];
                totalProfit = totalProfit + profit[i];

                System.out.println("Item " + (i + 1) + " selected fully");

            } else {

                double fraction =
                        (double) capacity / weight[i];

                totalProfit =
                        totalProfit + profit[i] * fraction;

                System.out.println(
                    "Item " + (i + 1) +
                    " selected partially: " +
                    (fraction * 100) + "%"
                );

                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}