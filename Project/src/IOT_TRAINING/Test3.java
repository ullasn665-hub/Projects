package IOT_TRAINING;

public class Test3 {
		int a ;
		int b ;

		void m1(int c,int d ) {
		 a=c;
		 b=d;
		}
		void m2() {
		 System.out.println(a+b);
		}

		public static void main(String[] args) {
			Test3   vv = new Test3();
			vv.m1(4,3);
			vv.m2();
		}
	}

