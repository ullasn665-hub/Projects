package Day4;
import java.util.Vector;

public class VectorConstructorDemo1 {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);
		
		vector.trimToSize();
		
		System.out.println("After trimming......");
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);

	}
}


