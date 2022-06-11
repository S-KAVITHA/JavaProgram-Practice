package LinkedListPgms;

public class RunLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// Insert the values
		list.insert(1);
		list.insert(21);
		list.insert(134);
		list.insert(45);

		list.insertStart(100);
		list.insertAtIndex(2, 200);
		list.insertAtIndex(0, 400);
		list.show();

		System.out.println("---------Deletion---------");
		list.deleteVal(400);
		list.show();
		
		System.out.println("---------Deletion---------");
		list.deleteVal(45);
		list.show();

		System.out.println("---------Deletion---------");
		list.deleteVal(21);
		list.show();

		System.out.println("---------Deletion Index---------");
		list.deleteIndex(2);
		list.show();
	
		System.out.println("---------Deletion Index---------");
		list.deleteIndex(0);
		list.show();
		
		System.out.println("---------Deletion Index---------");
		list.deleteIndex(1);
		list.show();
		
		
		
	}
}
