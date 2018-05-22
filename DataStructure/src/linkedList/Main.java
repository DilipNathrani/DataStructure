package linkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList objLinkedList = null;
		try {
			objLinkedList = new LinkedList();
		
			objLinkedList.addLast(5);
			objLinkedList.addLast(9);
				objLinkedList.addLast(2);
			objLinkedList.addLast(7);
			
			objLinkedList.addFirst(6);
			objLinkedList.addFirst(5);
			objLinkedList.addFirst(10);
			objLinkedList.addFirst(86);
			objLinkedList.addFirst(1);
			
			
			/*	objLinkedList.addMiddle(17,5);
			
			objLinkedList.addMiddle(99,1);
			
			objLinkedList.show();
			objLinkedList.removeFirst();*/
	/*		objLinkedList.addFirst(10);
			objLinkedList.addLast(2);*/
			
			/*objLinkedList.addFirst(6);
			objLinkedList.addFirst(5);
			objLinkedList.addFirst(10);
			objLinkedList.addFirst(86);
			objLinkedList.show();
			objLinkedList.removeLast();
			objLinkedList.addFirst(10);
			objLinkedList.addFirst(86);*/
			objLinkedList.show();
			objLinkedList.removeMiddle(5);
			objLinkedList.show();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
