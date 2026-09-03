package day12;

public class checkDuplicateInArray {
	static void CheckDuplicateInArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements are:"+arr[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,1};
		CheckDuplicateInArray(arr);

	}

}
