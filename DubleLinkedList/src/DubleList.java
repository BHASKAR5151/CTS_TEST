public class DubleList {
	Node head; // head of list

	public void InsertAfter(Node prev_Node, int new_data) {

		/* 1. check if the given prev_node is NULL */
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = prev_Node.next;

		prev_Node.next = new_node;

		new_node.prev = prev_Node;

		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	void append(int new_data) {
		Node new_node = new Node(new_data);

		Node last = head; /* used in step 5 */

		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		while (last.next != null)
			last = last.next;
		last.next = new_node;

		new_node.prev = last;
	}

	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	/* Drier program to test above functions */
	public static void main(String[] args) {
		/* Start with the empty list */
		DubleList dll = new DubleList();

		dll.append(6);
		dll.append(4);
		dll.InsertAfter(dll.head.next, 8);

		System.out.println("Created DLL is: ");
		dll.printlist(dll.head);
	}
}
