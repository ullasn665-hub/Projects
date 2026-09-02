package Day10;
public class JobSchedule {

    public static void main(String[] args) {

        char[] job = {'A', 'B', 'C', 'D', 'E'};
        int[] deadline = {2, 1, 2, 1, 3};
        int[] profit = {100, 50, 40, 70, 80};

    
        for (int i = 0; i < job.length - 1; i++) {
            for (int j = i + 1; j < job.length; j++) {

                if (profit[i] < profit[j]) {

                    int temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    temp = deadline[i];
                    deadline[i] = deadline[j];
                    deadline[j] = temp;

                    char tempJob = job[i];
                    job[i] = job[j];
                    job[j] = tempJob;
                }
            }
        }

        int maxDeadline = 0;

        for (int i = 0; i < deadline.length; i++) {
            if (deadline[i] > maxDeadline)
                maxDeadline = deadline[i];
        }

        char[] schedule = new char[maxDeadline];

        System.out.println("Selected Jobs:");

        for (int i = 0; i < job.length; i++) {

            for (int j = deadline[i] - 1; j >= 0; j--) {

                if (schedule[j] == '\0') {

                    schedule[j] = job[i];

                    System.out.println(
                        "Job " + job[i] +
                        "  Profit = " + profit[i]
                    );

                    break;
                }
            }
        }
    }
}