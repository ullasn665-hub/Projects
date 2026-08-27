package Day7;

public class BinarySearchNames {
public static void main(String[] args) {
	String[] names= {"Uday","Rakesh","Ullas","Vinod","Yashas","Ujwal"};
	String key="Ullas";
	int low = 0;
    int high = names.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        int result = names[mid].compareTo(key);

        if (result == 0) {
            System.out.println("String found at index: " + mid);
            return;
        } else if (result < 0) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    System.out.println("String not found");
    }
}

