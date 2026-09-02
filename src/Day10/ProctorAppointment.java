package Day10;

public class ProctorAppointment {

    public static void main(String[] args) {

        int[] start = {1, 2, 3, 5, 6};
        int[] end = {3, 4, 5, 7, 8};

        System.out.println("Selected Proctor Appointments");

        int lastEnd = end[0];

        System.out.println("Appointment 1");

        for (int i = 1; i < start.length; i++) {

            if (start[i] >= lastEnd) {

                System.out.println("Appointment " + (i + 1));

                lastEnd = end[i];
            }
        }
    }
}


