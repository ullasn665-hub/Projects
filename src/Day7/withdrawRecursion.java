package Day7;

public class withdrawRecursion {
static void withdraw(int n) {
	if(n==0) {
		System.out.println("Withdraw is "+n);
		
	}
	else {
		System.out.println("Withdraw is "+n);
		withdraw(n-2000);
	}
		
		
}
public static void main(String[] args) {
	withdraw(10000);
}
}
