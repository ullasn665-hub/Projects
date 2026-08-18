package IOT_TRAINING;

public class methodOverloading {
		void m1() {
			System.out.println("m1");
		}
		void m1(int a) {
			System.out.println("m1 with int a:"+a);
		}
		public static void main(String[] args) {
		   methodOverloading test = new methodOverloading();// object
			test.m1();
			test.m1(3);
		}
	}


