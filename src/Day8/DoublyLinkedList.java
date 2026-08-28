package Day8;

public class DoublyLinkedList {
        static class Node {
        	int data;
        	Node previous;
        	Node next;
        	Node(int data){
        		this.data=data;
        	}
        }
        public static void main(String[] args) {
        	Node first=new Node(10);
        	Node second=new Node(20);
        	Node third=new Node(30);
        	first.next=second;
        	second.next=third;
        	third.previous=second;
        	second.previous=first;
        	Node current=first;
        	System.out.println("Forward");
        	while(current!=null) {
        		System.out.println(current.data+"");
        		current=current.next;
        	}
        	current=third;
        System.out.println("\n Backwards:");
        while(current!=null) {
        	System.out.println(current.data+"");
        	current=current.previous;
        }
        }
}

