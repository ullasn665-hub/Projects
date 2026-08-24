package Day5;
import java.util.HashSet;
public class Demo9 {
 public static void main(String[] args) {
	 HashSet set=new HashSet();
	 System.out.println("Initial size of Hashset before adding elements:"+set.size());
	 System.out.println("Hashset is empty before adding elements:"+set.isEmpty());
	 System.out.println("Contents of Hashset before adding elements:"+set);
	 set.add("C");
	 set.add("A");
	 set.add("E");
	 set.add("B");
	 set.add("D");
	 set.add("F");
	 set.add(null);
	 System.out.println("size of Hashset after adding elements:"+set.size());
	 System.out.println("Hashset is empty after adding elements:"+set.isEmpty());
	 System.out.println("Contents of Hashset after adding elements:"+set);
	 boolean b1=set.contains("E");
	 System.out.println("value E is present:"+b1);
	 boolean b2=set.contains("R");
	 System.out.println("value E is present:"+b2);
	 set.remove("B");
	 System.out.println("size of Hashset after deleting elements:"+set.size());
	 System.out.println("Hashset is empty after deleting elements:"+set.isEmpty());
	 System.out.println("Contents of Hashset after deleting elements:"+set);
	 set.clear();
	 System.out.println("size of Hashset after clearing elements:"+set.size());
	 System.out.println("Contents of Hashset after clearing elements:"+set);
	 
	 }
}
