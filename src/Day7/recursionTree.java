package Day7;

public class recursionTree {
 static void count(int n) {
	 if(n==0) {
		return;
		 
	 }
	 else
		 System.out.println("calling count("+n+")");
	     count(n-1);
	     System.out.println("Returning from count("+n+")");
	     }
 public static void main(String[] args) {
	 count(5);
 }
}
