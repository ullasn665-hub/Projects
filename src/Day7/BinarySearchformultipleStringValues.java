package Day7;

public class BinarySearchformultipleStringValues {
			public static void main(String[] args) {

		        String[] arr = {
		            "Amit", "Rahul", "Rahul", "Rahul",
		            "Ravi", "Ravi", "Ravi", "Yashas"
		        };

		        String key = "Ravi";

		        int left = 0;
		        int right = arr.length - 1;
		        int first = -1;
		        while (left <= right) {

		            int mid = (left + right) / 2;

		            if (arr[mid].equals(key)) {

		                first = mid;
		                right = mid - 1;

		            } else if (key.compareTo(arr[mid]) > 0) {

		                left = mid + 1;

		            } else {

		                right = mid - 1;
		            }
		        }
		        left = 0;
		        right = arr.length - 1;

		        int last = -1;

		        while (left <= right) {

		            int mid = (left + right) / 2;

		            if (arr[mid].equals(key)) {

		                last = mid;
		                left = mid + 1;

		            } else if (key.compareTo(arr[mid]) > 0) {

		                left = mid + 1;

		            } else {

		                right = mid - 1;
		            }
		        }

		        if (first != -1) {

		            System.out.println("First index: " + first);
		            System.out.println("Last index: " + last);

		        } else {

		            System.out.println("Element not found");
		        }
		    }
		
	}


