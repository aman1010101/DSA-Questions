package Dsa;

public class LinkedList {
	public static class Node {
		int data;
		Node next;

		/*--Initialize Head and Tail-- */
		public Node(int data) {
			this.data = data;
			this.next = null;// initially next points to null!
		}
	}

	public static Node Head;
	public static Node Tail;

	/*--Creating method to insert new node at first --*/
	public void addFirst(int data) {
		Node newNode = new Node(data);
		// Step no 1 if Node is empty!
		if (Head == null) {
			Head = Tail = newNode;
			return;
		}
		// Step 2nd Linking
		newNode.next = Head;
		// Step 3rd;
		Head = newNode;
	}

	/*-- Method to add node at last-- */
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (Head == null) {
			Head = Tail = newNode;
			return;
		}
		// step 2 linking
		Tail.next = newNode;
		// Step 3
		Tail = newNode;
	}

	/*--Method to print LinkedList--*/
	public void printNode() {
		if (Head == null) {
			System.out.println("LinkedList is empty");
		}
		Node temp = Head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*-- Creating object of LinkedList class-- */
		LinkedList ll = new LinkedList();
		/*--Calling Methods--*/
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(5);
		ll.addLast(9);
		ll.printNode();

	}

}
