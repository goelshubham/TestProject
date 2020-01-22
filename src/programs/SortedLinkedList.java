package programs;

public class SortedLinkedList {

	private Node head;

	private class Node {
		int value;
		Node next;

		public Node(int value) {
			super();
			this.value = value;
			this.next = null;
		}
	}

	/**
	 * Method to add an integer to the SortedLinkedList
	 * Time complexity: O(n) where n is the number of integers inserted
	 */
	public void add(int data) {

		Node newNode = new Node(data);

		// if list is empty
		if (this.head == null) {
			this.head = newNode;
		}

		// if list is not empty
		else {

			Node next = this.head;
			Node previous = this.head;
			while (next != null && next.value < data) {
				previous = next;
				next = next.next;
				previous.next = next;
			}

			if (previous == next) {
				newNode.next = next;
				previous = newNode;
				this.head = newNode;
			}

			else {
				newNode.next = next;
				previous.next = newNode;
				previous = previous.next;
			}
		}
	}

	/**
	 * Method to print the contents of SortedLinkedList
	 * Time Complexity: O(n) where n is the number of integers inserted
	 */
	public String toString() {
		StringBuilder result = new StringBuilder();
		Node currentNode = this.head;
		result.append("[");
		while (currentNode != null) {
			result.append(currentNode.value + ", ");
			currentNode = currentNode.next;
		}
		
		result.append("]");
		
		//remove extra comma and space
		if(result.length() > 2)
			result.delete(result.length()-3, result.length()-1);
		
		return result.toString();
	}

}
