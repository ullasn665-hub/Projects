package Day3;
import java.util.Iterator;
public class Demo4 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("method" +i);
		}
	}
	public static void main(String[] args ) {
		Demo4 bb=new Demo4();
		bb.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method" +i);
		}
	}

}
