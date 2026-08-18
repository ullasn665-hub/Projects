package IOT_TRAINING;

	interface Atm
	{
		abstract void depo();	
		abstract void with();
	}
	abstract class Abc implements Atm
	{	
		public	void depo()
		{
			System.out.println("Depos");
		}
		}

	public class Demo2 extends Abc{

		public	void with()
		{
			System.out.println("With");
		}

		
	public static void main(String[] args) {
		Demo2   v = new Demo2();
		v.depo();
		v.with();
	}
	}

