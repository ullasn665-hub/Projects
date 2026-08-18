package IOT_TRAINING;

public class Test5 {
		private int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

	}

 class Demo extends Test5 {

		public static void main(String[] args) {
			Demo test = new Demo();// object
			test.setA(11);
			int aa = test.getA();
			System.out.println(aa);
		}
	}

