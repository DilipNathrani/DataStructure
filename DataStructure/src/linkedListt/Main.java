/**
 *
 */
package linkedListt;

/**
 * @author dilip
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList objLinkedList = new LinkedList();
		/*objLinkedList.addFirst(5);
		objLinkedList.addFirst(4);
		objLinkedList.addFirst(3);
		objLinkedList.addFirst(2);
		objLinkedList.showLinkedList();*/
		/*objLinkedList.addFirst(4);
		objLinkedList.addFirst(3);
		objLinkedList.addFirst(2);
		objLinkedList.addMiddle(4,5);*/
		objLinkedList.addViaSorted(5);
		objLinkedList.addViaSorted(8);
		objLinkedList.addViaSorted(4);
		objLinkedList.addViaSorted(4);
		objLinkedList.addViaSorted(3);
		objLinkedList.addViaSorted(6);
		objLinkedList.addViaSorted(59);
		objLinkedList.addViaSorted(-1);
		objLinkedList.addViaSorted(9);
		objLinkedList.addViaSorted(1);
		objLinkedList.addViaSorted(0);
		objLinkedList.addViaSorted(0);
		objLinkedList.addViaSorted(9);
		objLinkedList.addViaSorted(500);	objLinkedList.showLinkedList();
	}

}
