package linkedListt;

public class LinkedList {

	Node head;
	int counter = 0;

	public void addFirst(int data) {

		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
			counter++;
			System.out.println("node added");
			return;
		}
		node.next = head;
		head = node;
		counter++;
		System.out.println("node added");

	}

	public void showLinkedList() {
		if (head == null) {
			System.out.println("Linked List is null");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public void addLast(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
			counter++;
			System.out.println("node added");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		counter++;
		System.out.println("node added");

	}

	public void addMiddle(int position, int data) {

		if (position == 1) {
			addFirst(data);
			return;
		}
		if (position == (counter+1)) {
			addLast(data);
			return;
		}
		Node temp = head;
		int flag = 1;
		while (temp != null) {
			flag++;
			if (flag == position) {
				break;
			}
			temp = temp.next;

		}

		Node node = new Node();
		node.data = data;
		counter++;
		node.next = temp.next;
		temp.next = node;
		System.out.println("node added");

	}

	public void addViaSorted(int data) {


		if (head == null) {
			addFirst(data);
			return;
		}
		Node temp = head;
		int flag=1;
		while (temp != null) {

				if((data < temp.data && flag==1)){
					addFirst(data);
					return;
				}
				if(data > temp.data && temp.next == null  && flag==counter){
					addLast(data);
					return;
				}

				if(temp.next != null){
				if( temp.data < data && temp.next.data > data){
					flag++;
					addMiddle(flag, data);
					flag--;
					return;
				}
				}

				if(temp.data == data){
					addMiddle(flag, data);
					return;
				}




			flag++;

			temp = temp.next;

		}


	}
}
