package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList objLinkedList = null;
		try {
			objLinkedList = new LinkedList();
			/*objLinkedList.addFirst(6);
			objLinkedList.addFirst(9);
			objLinkedList.addFirst(12);
			objLinkedList.addFirst(15);
			objLinkedList.addFirst(89);
			objLinkedList.addFirst(30);*/
			objLinkedList.addLast(17);
			objLinkedList.addLast(15);
			objLinkedList.addLast(89);
			/*objLinkedList.show();*/
			/*objLinkedList.test();*/
			objLinkedList.addLast(11);
			objLinkedList.addLast(12);
			objLinkedList.addLast(19);
			objLinkedList.addLast(89);
			objLinkedList.addMiddle(13, 5);
			objLinkedList.addMiddle(13, 8);
			objLinkedList.show();
			objLinkedList.removeFirst();
			objLinkedList.show();
			objLinkedList.removeLast();
		/*	objLinkedList.show();
			objLinkedList.removeAtposition(3);*/
			objLinkedList.show();
			objLinkedList.removeAtposition(8);
			objLinkedList.show();
			
			
			objLinkedList.search(19);
			objLinkedList.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
