package Day6;

class FixedSlidingWindow {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 9, 3, 8};
        int k = 3;

        // First window sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int startIndex = 0;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                startIndex = i - k + 1;
            }
        }

        int endIndex = startIndex + k - 1;
        int indexSum = startIndex + (startIndex + 1) + endIndex;

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Subarray Indexes = " + startIndex + ", " + (startIndex + 1) + ", " + endIndex);
        System.out.println("Sum of Index Values = " + indexSum);
    }
}