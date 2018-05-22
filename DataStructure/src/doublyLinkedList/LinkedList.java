package doublyLinkedList;

public class LinkedList {

	Node head;
	int counter = 0;

	public void addFirst(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;
		node.previous = null;
		if (head == null) {
			head = node;
			node.previous = head;

			System.out.println("node added sucessfully");
			counter++;
			return;
		}

		node.next = head;
		head.previous = node;
		head = node;
		System.out.println("node added sucessfully");
		counter++;

	}

	public void show() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node temp = head;
		System.out.println("number of nodes : " + counter);
		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data);

		System.out.println();
	}

	public void addLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;

			System.out.println("node added sucessfully");
			counter++;
			return;
		}

		Node temp = head;

		while (temp.next != null)
			temp = temp.next;

		temp.next = node;
		node.previous = temp;
		counter++;

	}

	public void addMiddle(int data, int position) {

		if (position == 1) {
			addFirst(data);
			return;
		}
		if ((++counter) == position) {
			counter--;
			addLast(data);
			return;
		} else {
			counter--;
		}

		Node node = new Node();
		node.data = data;
		int flag = 1;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			flag++;
			if (flag == position)
				break;

		}

		node.next = temp;
		node.previous = temp.previous;
		temp.previous.next = node;
		temp.previous = node;

		counter++;

		System.out.println("node added sucessfully");

	}

	public void removeFirst() {

		if (head == null) {
			System.out.println("list is empty can not remove");
			return;
		}

		if (head.next == null) {
			head = null;
			counter--;
			System.out.println("node removed sucessfully");
			return;
		}

		head.next.previous = head;
		head = head.next;

		counter--;
		System.out.println("node removed sucessfully");

	}

	public void removeLast() {

		if (head == null) {
			System.out.println("list is empty can not remove");
			return;
		}

		if (head.next == null) {
			head = null;
			System.out.println("node removed sucessfully");
			return;
		}

		Node temp = head;
		while (temp.next != null)
			temp = temp.next;

		temp.previous.next = null;
		counter--;
		System.out.println("node removed sucessfully");

	}

	public void removeAtposition(int position) {

		if (head == null) {
			System.out.println("list is empty can not remove");
			return;
		}

		if (position == 1) {
			removeFirst();
			return;
		}

		if (counter == position) {
			removeLast();
			return;
		}

		if (position > counter) {
			System.out.println("invalid index number");
			return;
		}

		Node temp = head;
		int flag = 1;
		while (temp.next != null) {
			if (flag == position)
				break;
			temp = temp.next;

			flag++;
		}

		temp.previous.next = temp.next;
		temp.next.previous = temp.previous;
		counter--;
		System.out.println("node removed successfully");
	}

	public void search(int data) {

		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		Node temp = head;
		boolean flag = false;
		int nodeNumber = 1;
		while (temp.next != null) {

			if (temp.data == data) {
				flag = true;
				break;
			}

			temp = temp.next;
			nodeNumber++;
		}
		if(flag)
			System.out.println("data is found "+nodeNumber+" node number");
		else
			System.out.println("data not found");

	}

}
