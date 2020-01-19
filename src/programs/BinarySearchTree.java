package programs;

public class BinarySearchTree {

	private Node root;

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	//Time complexity: O(log(n)) where n are the number of integers inserted
	public void add(int data) {
		root = addNode(root, data);
	}

	private Node addNode(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		// insert left
		if (root.data > data) {
			root.left = addNode(root.left, data);
		}
		// insert right
		else {
			root.right = addNode(root.right, data);
		}

		return root;
	}

	StringBuilder result;

	
	
	public String toString() {
		result = new StringBuilder();
		result.append("[");
		inOrderTraversal(root);
		result.append("]");
		return result.toString();

	}

	private void inOrderTraversal(Node root) {

		if (root != null) {
			inOrderTraversal(root.left);
			result.append(root.data + " ");
			inOrderTraversal(root.right);
		}
	}
}
