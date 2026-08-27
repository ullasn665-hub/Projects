package Day7;

public class mergeSort {
	static void mergerSort(int[] a,int left,int right) {
		if(left>=right) {
			return;
		}
		int mid=(left+right)/2;
		mergerSort(a,left,mid);
		mergerSort(a,mid+1,right);
		int[] temp=new int[right-left+1];
		int i=left,j=mid+1,k=0;
		 while (i <= mid && j <= right) {

	            if (a[i] < a[j]) {
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

	        int[] arr = {8, 3, 5, 1, 7, 2, 6, 4};

	        mergerSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted Array:");

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
}

