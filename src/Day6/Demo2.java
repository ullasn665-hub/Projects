package Day6;

public class Demo2 {

    public static void main(String[] args) {

        int[] expenses = {100, 200, 150, 300, 250};

        int[] prefixSum = new int[expenses.length];

       
        prefixSum[0] = expenses[0];

        for (int i = 1; i < expenses.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + expenses[i];
        }

        int sum;
        int bestSum = 0;

       
        for (int i = 0; i <= expenses.length - 3; i++) {

            if (i == 0) {
                sum = prefixSum[i + 2];
            } else {
                sum = prefixSum[i + 2] - prefixSum[i - 1];
            }

            System.out.println("Sum = " + sum);

            if (sum > bestSum) {
                bestSum = sum;
            }
        }

        System.out.println("Best profit = " + bestSum);
    }
}


