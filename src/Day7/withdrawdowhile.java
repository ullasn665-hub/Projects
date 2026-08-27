package Day7;

public class withdrawdowhile {
    static void withdraw(int n) {
    	do {
    		n=n-2000;
    		System.out.println("balance"+n);
    	}while(n!=0);
    }
	public static void main(String[] args) {
		withdraw(10000);

	}

}
