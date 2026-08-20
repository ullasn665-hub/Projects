package Day4;

public class Sal {
	public static void main(String[] args) {
		int[] sal= {10000,15000,12000,18000,20000};
		int sum=0;
		for(int salary:sal) {
			sum=sum+salary;
		}
		System.out.println("Total Salary:"+sum);
	}

}
