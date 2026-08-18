package IOT_TRAINING;

class Dem {
		private int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

	}

 class Test5 extends Dem {

		public static void main(String[] args) {
			Dem test = new Dem();// object
			test.setA(11);
			int aa = test.getA();
			System.out.println(aa);
		}
	}

