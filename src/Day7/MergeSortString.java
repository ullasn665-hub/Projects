package Day7;

public class MergeSortString {
	    static void mergeSort(String[] a, int left, int right) {

	        if (left >= right) {
	            return;
	        }

	        int mid = (left + right) / 2;

	        mergeSort(a, left, mid);
	        mergeSort(a, mid + 1, right);

	        String[] temp = new String[right - left + 1];

	        int i = left;
	        int j = mid + 1;
	        int k = 0;

	        while (i <= mid && j <= right) {

	            if (a[i].compareTo(a[j]) < 0) {
	                temp[k] = a[i];
	                i++;
	            } else {
	                temp[k] = a[j];
	                j++;
	            }

	            k++;
	        }
	        while (i <= mid) {
	            temp[k] = a[i];
	            i++;
	            k++;
	        }
	        while (j <= right) {
	            temp[k] = a[j];
	            j++;
	            k++;
	        }
	        for (i = left, k = 0; i <= right; i++, k++) {
	            a[i] = temp[k];
	        }
	    }

	    public static void main(String[] args) {

	        String[] arr = {"Mango", "Apple", "Banana", "Orange", "Grapes"};

	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted Array:");

	        for (String s : arr) {
	            System.out.print(s + " ");
	        }
	    }
	}


