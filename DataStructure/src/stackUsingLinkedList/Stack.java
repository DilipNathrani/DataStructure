/**
 * 
 */
package stackUsingLinkedList;

/**
 * @author Admin
 *
 */
public class Stack {

	Node head;
	Node tail;
	public void push(int data){
		
		Node node = null;
		try {
			node = new Node();
			node.data = data;
			node.next = null;
			if(head == null) {
				head = node;
				tail = head;
				tail.next = null;
				System.out.println("record inserted in the stack");
				return;
			}else {
				tail.next = node;
				tail = node;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
