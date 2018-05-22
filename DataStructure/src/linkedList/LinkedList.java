package linkedList;

public class LinkedList {

	Node head;
	int counter = 0;

	public void addLast(int data) {

		Node node = null;
		try {
			node = new Node();
			node.data = data;
			node.next = null;

			if (head == null) {
				head = node;
				counter++;
				return;
			}

			Node temp = head;

			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
			counter++;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void show() {
		System.out.println();
		Node node = head;
		
		if(head == null) {
			System.out.println("linkedlist is empty");
			return;
		}
		System.out.println("linkedlist size is  : "+counter);
		while (node != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		
		
		
	}

	public void addFirst(int data) {

		Node node = null;
		try {
			node = new Node();
			node.data = data;
			node.next = null;

			if (head == null) {
				head = node;
				counter++;
				return;
			}

		
			node.next = head;
			head = node;
			counter++;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void addMiddle(int data, int position) {
		
		Node node = null;
		int flag = 1;
		try {
			System.out.println("counter size is : "+counter);
			
			
			if((++counter) == position) {
				counter--;
				addLast(data);
				return;
			}
			
			if(position == 1) {
				addFirst(data);
				return;
			}
				
			node = new Node();
			node.data = data;
			node.next = null;

			

			
			Node current  = head;
			Node previous  = null;

			while (current.next != null) {
				System.out.println("from while");
				previous= current;
				current = current.next;
				flag++;
				if(flag==position)
					break;
				
			}
			
			previous.next = node;
			node.next = current;
			
			counter++;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeFirst() {
		
		if(head == null) {
			System.out.println("List is empty you can not remove the node");
			return;
		}
		
		if(head.next == null) {
			head = null;
			System.out.println("first node deleted succfully ");
			counter--;
			return;
		}
		
		head = head.next;
		System.out.println("first node deleted succfully ");
		counter--;
		
		
	}

	public void removeLast() {
		if(head == null) {
			System.out.println("List is empty you can not remove the node");
			return;
		}
		
		if(head.next == null) {
			head = null;
			System.out.println("first node deleted succfully ");
			counter--;
			return;
		}
		
		Node previous = null;
		Node current= head;
		while (current.next != null) {
			previous = current;
			current = current.next;
			
		}
		previous.next = null;
		counter--;
		
	}

	public void removeMiddle(int position) {
		
		if(position == 1) {
			removeFirst();
			return;
		}
		
		if(counter == position) {
			removeLast();
			return;
		}
		
		if(position > counter) {
			System.out.println("invalid position");
			return;
		}
		
		Node current = head;
		Node previous = null;
		int flag = 1;
		
		while (current.next!= null) {
			previous = current;
			current = current.next;
			flag++;
			if(flag == position)
				break;
			
		}
		
		
			previous.next = current.next;
			counter--;
			System.out.println("middle node has been deleted succesfully");
			
			
		
	}
}
