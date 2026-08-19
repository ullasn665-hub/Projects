package Day3;

public class Demo1 {
    public static void main(String[] args) {
    	try {
    		System.out.println("anand");
    		System.out.println(10/0);
    	}
    	catch(NullPointerException e) {
    		System.out.println("u r getting e"+e);
    	}
    	finally {
    		System.out.println("finally block is always executed");
    		
    	}
    	System.out.println("using System.exit(0) cannot execute finally as the program itself terminates");
    }
}
