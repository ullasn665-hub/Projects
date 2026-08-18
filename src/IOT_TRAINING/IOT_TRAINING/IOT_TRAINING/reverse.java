package IOT_TRAINING;

public class reverse{
 public	static void reverse(char[] a, int i) {
	        if (i < 0)
	            return;

	        System.out.print(a[i]);
	        reverse(a, i - 1);
	    }

	    public static void main(String[] args) {
	        String s = "hello";

	        char[] a = s.toCharArray();

	        reverse(a, a.length - 1);
	    }
	}


