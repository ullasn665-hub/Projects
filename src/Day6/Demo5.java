package Day6;
import java.util.HashSet;
public class Demo5 {
	public static void main(String[] args) {
			  int[] a = {1, 2, 3, 4, 5};
		        int[] b = {4, 5, 6, 7, 8};

		        HashSet<Integer> unioni = new HashSet<>();

		        for (int i = 0; i < a.length; i++) {
		            unioni.add(a[i]);
		        }

		        for (int i = 0; i < b.length; i++) {
		            unioni.add(b[i]);
		        }

		        System.out.println("Union of arrays: " + unioni);
		}

	}

