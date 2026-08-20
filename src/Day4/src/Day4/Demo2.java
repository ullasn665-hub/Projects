package Day4;

public class Demo2 {
	public static void main(String[] args) {
		int n=100000;
		int target=1000;
		int[] students=new int[n];
		for(int i=0;i<n;i++) {
			students[i]=i+1;
			if(students[i]==target) {
				System.out.println("Target is found");
			
			}
			else 
				continue;
			
		}
	}

}
