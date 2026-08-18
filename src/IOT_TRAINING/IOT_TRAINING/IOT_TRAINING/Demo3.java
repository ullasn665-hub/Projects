package IOT_TRAINING;
	interface atm {
		abstract void depo();
	}
	interface Demo1 {
		abstract void min();
	}
public class Demo3 implements atm, Demo1 {
		public void depo() {
			System.out.println("dep");
		}
		public void min() {
			System.out.println("min");
		}
		public static void main(String[] args) {
			Demo3 v = new Demo3();
			v.min();
			v.depo();
		}
	}

