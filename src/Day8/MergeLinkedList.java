package Day8;
		public class MergeLinkedList {

		    static class Node {
		        int data;
		        Node next;

		        Node(int data) {
		            this.data = data;
		        }
		    }

		    static Node merge(Node first, Node second) {

		        Node dummy = new Node(0);
		        Node temp = dummy;

		        while (first != null && second != null) {

		            if (first.data < second.data) {
		                temp.next = first;
		                first = first.next;
		            } else {
		                temp.next = second;
		                second = second.next;
		            }

		            temp = temp.next;
		        }

		        if (first != null) {
		            temp.next = first;
		        }

		        if (second != null) {
		            temp.next = second;
		        }

		        return dummy.next;
		    }

		    static void display(Node head) {

		        while (head != null) {
		            System.out.print(head.data + " ");
		            head = head.next;
		        }
		    }

		    public static void main(String[] args) {
		       	Node first = new Node(10);
		        first.next = new Node(20);
		        first.next.next = new Node(40);

		        // Second linked list
		        Node second = new Node(5);
		        second.next = new Node(15);
		        second.next.next = new Node(30);

		        
		        Node result = merge(first, second);

		        System.out.println("Merged Linked List:");
		        display(result);
		    }
		

	}


