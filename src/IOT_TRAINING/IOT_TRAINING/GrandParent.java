package IOT_TRAINING;
public class GrandParent
{ public static void main(String[] args) {
		Child  bb= new Child();
		bb.bp();
		bb.cancer();}
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}
 class Child extends Parent{

	
	}
 
