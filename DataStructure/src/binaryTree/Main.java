package binaryTree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree objBinaryTree = null;
		try{
			objBinaryTree = new BinaryTree();
			objBinaryTree.add(10);
			/*objBinarlyTree.add(20);
			objBinaryTree.add(5);
			objBinaryTree.add(15);*/
			objBinaryTree.traverseInOrder(objBinaryTree.root);
		}catch (Exception e) {
		
			e.printStackTrace();
		}
		

	}

}
