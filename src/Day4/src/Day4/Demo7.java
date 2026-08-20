package Day4;
import java.util.HashSet;
public class Demo7 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
	
		 for(int i=1;i<=20;i++) {
			 if(i%2==0) 
				 set.add(i);
			 else 
				 continue;
		 }
		 System.out.println(set);
		 
	}

}
