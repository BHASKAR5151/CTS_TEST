public class SinglyLinkedList extends Node {
	private Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		SinglyLinkedList myLinkedlist = new SinglyLinkedList();
		myLinkedlist.insertFirst(5);
		myLinkedlist.insertFirst(6);
	
		Node node=new Node();
		node.data=1;
		myLinkedlist.deleteFirst();
		myLinkedlist.printLinkedList();
	}
}
