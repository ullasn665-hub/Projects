package Day4;

public class Demo {
	public static void main(String[] args) {
		int n=10000;
		int[] students=new int[n];
		for(int i=0;i<n;i++) {
			students[i]=i+1;
		}
		int target=1000;
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(students[i]==target) {
				found=true;
			}
		}
		if(found) {
			
		}
	
	    System.out.println("Student Found:"+found);
	}
}
