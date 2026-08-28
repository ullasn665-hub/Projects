package Day8;

import Day8.LinkedList.Node;

public class reversalLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		}
		public static void main(String[] args) {

		    Node first = new Node(10);
		    Node second = new Node(20);
		    Node third = new Node(30);

		    first.next = second;
		    second.next = third;
		    Node previous=null;
		    Node current=first;
		    while(current!=null) {
		    	Node next=current.next;
		    	current.next=previous;
		    	previous=current;
		    	current=next;
		    }
		    current=previous;
		    while(current!=null) {
		    	System.out.print(current.data + " -> ");

		        current = current.next;
		    }
		    System.out.println("NULL");
	}
	}
	
