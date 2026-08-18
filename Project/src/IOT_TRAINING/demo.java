package IOT_TRAINING;

public class demo {
	int a = 66; // instance 
	   static	int cc = 99;
		void m1() {
			int a = 10;
			System.out.println("Local variable:" + a);
		}
		public demo() {
			int b = 10;
			System.out.println("Local variable:" + b);
		}
		public static void main(String[] args) {
			demo test = new demo();// object
			test.m1();
			System.out.println("Thankyou you"+test.a);
			System.out.println(cc);
			System.out.println(demo.cc);

		}
	}


