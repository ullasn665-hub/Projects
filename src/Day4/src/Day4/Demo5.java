package Day4;
import java.util.ArrayList;
public class Demo5 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println("Initial size of ArrayList before adding elements:"+list.size());
		System.out.println("ArrayList is empty before adding value"+list.isEmpty());
		System.out.println("Content of ArrayList before adding values "+list);
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("E");
		list.add("F");
		list.add(null);
		list.add("A");
		list.add(null);
		System.out.println("Initial size of ArrayList before adding elements:"+list.size());
		System.out.println("ArrayList is empty before adding value"+list.isEmpty());
		System.out.println("Content of ArrayList before adding values "+list);
		boolean b1=list.contains("E");
		System.out.println("Value E is present:"+b1);
		boolean b2=list.contains("B");
		System.out.println("Value B is present:"+b2);
		list.remove("B");
		System.out.println("Size of ArrayList after deletion:"+list.size());
		System.out.println("Content of ArrayList before adding values "+list);
		 list.clear();
	     System.out.println("Size of arraylist after clearing: " + list.size());
	     System.out.println("Contents of Arraylist after clearing: " + list);
		
		
		
	}

}
