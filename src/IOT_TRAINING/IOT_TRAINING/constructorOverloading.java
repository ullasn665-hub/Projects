package IOT_TRAINING;

public class constructorOverloading {
	constructorOverloading(){
		System.out.println("Hello world");
		
	}
	constructorOverloading(int a){
		System.out.println("Input Number is:"+a);
	}
	public static  void main(String[] args) {
		constructorOverloading test1=new constructorOverloading();
		constructorOverloading test2=new constructorOverloading(8);
		
	}

}
