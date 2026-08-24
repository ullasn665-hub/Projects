package Day5;
import java.util.*;
import java.util.HashSet;

public class Demo10 {
	public static void main(String[] args) {
		 HashSet set=new HashSet();
		 System.out.println("Initial size of Hashset before adding elements:"+set.size());
		 System.out.println("Hashset is empty before adding elements:"+set.isEmpty());
		 System.out.println("Contents of Hashset before adding elements:"+set);
		 set.add("A");
		 set.add("A");
		 set.add("B");
		 set.add("C");
		 set.add("E");
		 set.add("F");
		 set.add("G");
		 set.add(40);
		 set.add(null);
		 System.out.println("size of Hashset after adding elements:"+set.size());
		 System.out.println("Hashset is empty after adding elements:"+set.isEmpty());
		 System.out.println("Contents of Hashset after adding elements:"+set);
		 Iterator it = set.iterator();

	        while (it.hasNext()) {
	            System.out.println(it.next());
}
	        }
}
