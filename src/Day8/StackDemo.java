package Day8;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<Integer>stack=new Stack<>();
     stack.push(10);
     stack.push(20);
		stack.push(30);
		System.out.println("Stack:"+stack);
		System.out.print("Top element:"+ stack.peek());
		System.out.println("Removed:"+stack.pop());
		System.out.println("Stack after pop:"+stack);
		System.out.println("Is stack empty:"+stack.isEmpty());
	}

}
