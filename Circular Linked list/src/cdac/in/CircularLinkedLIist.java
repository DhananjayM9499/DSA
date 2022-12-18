package cdac.in;

public class CircularLinkedLIist {
	public Node head;
	public Node tail;
	public int size;

	public Node createNode(int nodeValue) {
		head = new Node();
		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = newNode;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

	// Insert Node
	public void insertNode(int nodeValue, int location) {
		Node newNode = new Node();
		newNode.value = nodeValue;
		if (head == null) {
			createNode(nodeValue);
		} else if (location == 0) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		} else if (location >= size) {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;

		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;

			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
		size++;
	}

	public void traverse() {
		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value + " --> ");
				tempNode = tempNode.next;
			}

		} else {
			System.out.println("Circular Linked LIst does not exit");
		}
	}

	// delete the node
	public void deleteNode(int location) {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		} else if (location == 0) {
			head = head.next;
			tail.next = head;
			size--;
			if (size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		} else if (location >= size) {
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if (tempNode == head) {
				head.next = null;
				tail = head = null;
				size--;
				return;
			}
			tempNode.next = head;
			tail = tempNode;
			size--;
		}

		else {
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}

	}

	// delete all the nodes
	public void deleteAllNodes() {
		if (head == null) {
			System.out.println("The list is empty");
			
		}
		else {
			head = null;
			tail.next = null;
			tail = null;
			size = 0;
			System.out.println("the list deleted parmanenetly");
		}
	}
}
