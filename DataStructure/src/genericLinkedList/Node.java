package genericLinkedList;

public class Node<T> {

	T data;
	Node<?> next;

	@Override
	public boolean equals(Object obj) {
		return obj.equals(this.data);
	}



}
