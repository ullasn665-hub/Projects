package IOT_TRAINING;

public class Demo4 {
	int a = 66; // instance 
	   static	int cc = 99;
		void m1() {
			int a = 10;
			System.out.println("Local variable:" + a);
		}
		public Demo4() {
			int b = 10;
			System.out.println("Local variable:" + b);
		}
		public static void main(String[] args) {
			Demo4 test = new Demo4();// object
			test.m1();
			System.out.println("Thankyou you"+test.a);
			System.out.println(cc);
			System.out.println(Demo4.cc);

		}
	}


