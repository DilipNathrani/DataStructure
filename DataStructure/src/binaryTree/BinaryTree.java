package binaryTree;

public class BinaryTree {

	Node root;
	
	public void add(int value) {
		root = addRecursice(root,value);
		
	}

	private Node addRecursice(Node current, int value) {

		if(current == null) {
			return new Node(value);
		}
		
		if(value < current.value) 
			current.left = addRecursice(current.left, value);
		else if(value > current.value)
			current.right = addRecursice(current.right, value);
		else
			return current;
		
		
		return current;
	}
	
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	
}
