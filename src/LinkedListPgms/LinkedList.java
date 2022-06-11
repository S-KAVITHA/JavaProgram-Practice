package LinkedListPgms;

public class LinkedList {

	static Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtIndex(int index, int data) {
		Node newNode = new Node(data);
		if (index == 0) {
			insertStart(data);
		} else {

			Node firstNode = head;
			for (int i = 0; i < index - 1; i++) {
				firstNode = firstNode.next;
			}
			newNode.next = firstNode.next;
			firstNode.next = newNode;
		}
	}

	public void deleteIndex(int index) {
		Node temp = head;
		Node previous = null;

		if (temp == null) {
			// Display the message
			System.out.println(index + " position element not found");
			return;
		}

		if (index == 0 && temp != null) {
			 head = temp.next ;
			System.out.println(index + " position element deleted");
			return;
		}
		
		for (int i = 0; i < index; i++) {
			previous = temp;
			temp = temp.next;
		}

		previous.next = temp.next;
		System.out.println(index + " position element deleted");

	}

	public void deleteVal(int value) {
		Node temp = head;
		Node previous = null;

		if (temp == null) {
			System.out.println("Can't delete Linked List empty");
			return;
		}

		// if the head node itself needs to be deleted
		if (temp.data == value) {
			head = temp.next; // changing head to next in the list
			System.out.println("Deleted value from Linked List:: " + value);
			return;
		}

		// traverse until we find the value to be deleted or LL ends
		while (temp != null && temp.data != value) {
			// store previous link node as we need to change its next val
			previous = temp;
			temp = temp.next;
		}

		// if value is not present then
		// temp will have traversed to last node NULL
		if (temp == null) {
			System.out.println("Value not found");
			return;
		}

		// for node to be deleted : temp lets call it nth node
		// assign (n-1)th node's next to (n+1)th node
		previous.next = temp.next;

		System.out.println("Deleted value from Linked List:: " + value);
	}

	public void show() {

		Node node = head;

		while (node != null) {
			System.out.println("Data :" + node.data);
			node = node.next;

		}
	}
}
