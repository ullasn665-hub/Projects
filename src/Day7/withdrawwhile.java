package Day7;

public class withdrawwhile {
 static void withdraw(int n) {
	 while(n!=0) {
		 n=n-2000;
		 System.out.println("balance is:"+n);
	 }
 }
	 public static void main(String[] args) {
		 withdraw(10000);
	 }
 }

