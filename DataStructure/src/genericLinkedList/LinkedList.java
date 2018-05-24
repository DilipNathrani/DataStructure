package genericLinkedList;

public class LinkedList {

	Node<?> head;
	int counter = 0;

	public <T> void addFirst(T data) {

		Node<T> node = new Node<>();
		node.data = data;
		if (head == null) {
			head = node;
			counter++;
			return;
		}
		node.next = head;
		head = node;
		counter++;

	}

	public void showLinkedList() {
		System.out.println();
		if (head == null) {
			System.out.println("Linked List is null");
			return;
		}
		Node<?> temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public <T> void addLast(T data) {
		Node<T> node = new Node<>();
		node.data = data;
		if (head == null) {
			head = node;
			counter++;

			return;
		}
		Node<?> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		counter++;

	}

	public <T> void addMiddle(int position, T data) {

		if (position == 1) {
			addFirst(data);
			return;
		}
		if (position == (counter + 1)) {
			addLast(data);
			return;
		}
		Node<?> temp = head;
		int flag = 1;
		while (temp != null) {
			flag++;
			if (flag == position) {
				break;
			}
			temp = temp.next;

		}

		Node<T> node = new Node<>();
		node.data = data;
		counter++;
		node.next = temp.next;
		temp.next = node;

	}

	public <T> void removeFromFirst(T data) {
		if (head == null) {
			System.out.println("List is empty...can't remove");
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		if (head.next != null) {
			head = head.next;
			;
			return;
		}
	}

	public <T> void remove(T data) {

		if (head == null) {
			System.out.println("List is null...cant' remove");
			return;
		}
		Node<?> temp = head;
		Node<?> privious = null;
		int flag = 1;
		while (temp != null) {
			if (data.equals(temp.data) && temp.next == null && flag == 1) {
				head = null;
				return;
			}

			if (data.equals(temp.data) && temp.next == null && counter == flag) {
				privious.next = null;
				return;
			}

			if (data.equals(temp.data)) {
				if (flag == 1) {
					head = head.next;
					return;
				}else{
					privious.next = temp.next;
					temp = null;
					return;
				}
			}
			flag++;
			privious = temp;
			temp = temp.next;
		}
	}

	/*
	 * public void addViaSorted(int data) {
	 *
	 *
	 * if (head == null) { addFirst(data); return; } Node temp = head; int
	 * flag=1; while (temp != null) {
	 *
	 * if((data < temp.data && flag==1)){ addFirst(data); return; } if(data >
	 * temp.data && temp.next == null && flag==counter){ addLast(data); return;
	 * }
	 *
	 * if(temp.next != null){ if( temp.data < data && temp.next.data > data){
	 * flag++; addMiddle(flag, data); flag--; return; } }
	 *
	 * if(temp.data == data){ addMiddle(flag, data); return; }
	 *
	 *
	 *
	 *
	 * flag++;
	 *
	 * temp = temp.next;
	 *
	 * }
	 *
	 *
	 * }
	 */
}
